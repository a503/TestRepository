package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exam02HtmlController {

	@RequestMapping("/html/exam01") // http://localhost:8080/WebApplication이 생략되어 있다
	public String html() {
		return "html/exam01"; // /WEB-INF/views/html.jsp 가 생략되어있다.
	}
}
