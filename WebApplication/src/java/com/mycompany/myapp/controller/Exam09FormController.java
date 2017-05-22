/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author kang
 */
@Controller // 이 어노테이션이 사용되면 스프링이 해당 객체를 싱글톤으로 유지하게되고 요청이 들어오면 동일한 객체를 사용한다.
// 서비스 클래스일경우 @Component 어노테이션을 사용하면 스프링이 해당 서비스 객체를 싱글톤으로 유지한다.
//@RequestMapping("/form")
public class Exam09FormController {

	@Autowired
	private ServletContext servletContext;

	@RequestMapping(value = "/form/exam01", method = RequestMethod.GET)
	public String joinForm() {
		return "form/exam01";
	}

	@RequestMapping(value = "/form/exam01", method = RequestMethod.POST)
	public String join(String mid, String mname, String mpassword, @RequestParam(defaultValue = "0", required = true) int mage, String[] mskill, String mbirth) {
		System.out.println("mid : " + mid);
		System.out.println("mname : " + mname);
		System.out.println("mpassword : " + mpassword);
		System.out.println("mage : " + mage);
		for (String ms : mskill) {
			System.out.print("mskill : " + ms);
		}
		System.out.println("");
		System.out.println("mbirth : " + mbirth);

		return "form/exam01";
	}

	@RequestMapping(value = "/form/exam02", method = RequestMethod.GET)
	public String joinForm2() {
		return "form/exam02";
	}

	@RequestMapping(value = "/form/exam02", method = RequestMethod.POST)
	public String join2(String mid, String mname, String mpassword, @RequestParam(defaultValue = "0", required = true) int mage, String[] mskill, String mbirth,
		  MultipartFile mattach) {
		// 파일의 정보 얻기
		String fileName = mattach.getOriginalFilename();
		String contentType = mattach.getContentType();
		long fileSize = mattach.getSize();

		// 파일을 서버 하드디스크에 저장
		String realPath = servletContext.getRealPath("/WEB-INF/upload/" + fileName);
		// 실행환경마다 경로가 달라질수 있다 그러므로 어플리케이션이 실행될때 동적으로 리얼패스를 받아와 경로를 설정한다

		File file = new File(realPath);
		try {
			mattach.transferTo(file);
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (IllegalStateException ex) {
			ex.printStackTrace();
		}

		System.out.println("fileName : " + fileName);
		System.out.println("contentType : " + contentType);
		System.out.println("fileSize : " + fileSize);

		return "form/exam02";
	}
	@RequestMapping("/file/exam03")
	public void download(HttpServletResponse response, @RequestHeader("User-Agent") String userAgent) { // 파일 다운로드 할때만 페이지를 리턴 할필요가 없으므로 return타입을 void로 설정
		try {
			// 응답 HTTP 헤더행을 추가
			// 1. 파일의 이름(옵션)
			String fileName = "자물쇠.png"; // 파일명이 한글일 경우 문자셋이 달라 깨진다.
			String encodingFileName;
			if (userAgent.contains("MSIE") || userAgent.contains("Trident") || userAgent.contains("Edge")) {
				encodingFileName = URLEncoder.encode(fileName, "UTF-8"); // 윈도우 계열
				System.out.println("encodingFileName : " + encodingFileName);
			}else{
				encodingFileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1"); // 그 외의 브라우저들
				//System.out.println("encodingFileName : " + encodingFileName);
			}
			response.addHeader("Content-Dispositon", "attachment; filename=\"" + encodingFileName + "\""); // "attachment"이므로 브라우저는 파일 다운로드 창을 실행하라는 말이다. // 브라우저마다 다운로드 처리방식 다르다.
			// 공백이 있을경우 공백전까지 파일이름으로 알게 되므로 \를 이용해 공백을 포함한 전체 파일명을 알수 있도록 해야한다.(filename=\"" + fileName + "\"")
			// 2. 파일의 종류(필수) 타입을 지정하지 않으면 다운받는 파일의 종류를 알수없다,
			response.addHeader("Content-Type", "image/png"); // jsp에서 파일 형식 지정할때 사용하는것과 같다. jpeg, png, gif, ... 차후에 동적으로 알아 낼 수 있다.
			// 3. 파일의 사이즈(옵션) 파일사이즈를 주지않으면 익스플로러는 파일사이즈를 알려주지 않는다
			File file = new File(servletContext.getRealPath("/WEB-INF/upload/" + fileName));
			long fileSize = file.length();

			response.addHeader("Content-Length", String.valueOf(fileSize)); // file size를 String으로 변환해서 입력

			// 응답 HTTP 본문에 파일 데이터를 출력
			OutputStream os = response.getOutputStream();
			FileInputStream fis = new FileInputStream(file);

			// spring 에서 손쉬운 방식 제공(바이트 배열을 얻어 읽고써도 상관없다
			FileCopyUtils.copy(fis, os);
			os.flush();
			fis.close();
			os.close();

		} catch (Exception ex) {

		}
	}
}
