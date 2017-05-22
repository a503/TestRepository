/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.controller;

import com.mycompany.myapp.service.Exam10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kang
 */
@Controller
public class Exam10DIController  {
	@Autowired
	private Exam10Service exam10Service; // spring 관리 객체중 Exam10Service가 있다면 자동적으로 해당객체를 주입시켜준다 //만약 인터페이스라면 스프링은 자동으로 구현된 객체를 찾아 자동적으로 대입된다 // 서비스 계층이 바뀌더라도 컨트롤러를 수정하지 않아도 되므로 인터페이스 사용
	
	
	@RequestMapping("/di/exam01")
	public String exam01(){
		System.out.println("exam01() 실행");
		exam10Service.join();
		return "di/exam01";
	}
	@RequestMapping("/di/exam02")
	public String exam02(){
		System.out.println("exam02() 실행");
		exam10Service.login();
		return "di/exam01";
	}
}
