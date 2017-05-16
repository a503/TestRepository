/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.controller;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author kang
 */
@Controller
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
	@RequestMapping("/file/download")
	public String download(){
		return "file/download";
	}
}
