package com.mycompany.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/") // 요청맵핑, 클라이언트가 괄호안으로 요청하면 밑에있는 메소드 실행
	public String home(){
		System.out.println("home");
		return "home";
	}
	@RequestMapping("/html")
	public String html(){
		return "html";
	}
}
