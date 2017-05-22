package com.mycompany.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/http")
public class Exam08HttpController {

	@RequestMapping(value = "/exam01", method = RequestMethod.GET)
	public String exam01Get() {
		System.out.println("exam01()Get...");
		return "http/exam01";
	}

	@RequestMapping(value = "/exam01", method = RequestMethod.POST)
	public String exam01Post() {
		System.out.println("exam01()Post...");
		return "http/exam01";
	}

	@RequestMapping(value = "/exam02")
	public String exam02(HttpServletRequest request, Model model) {
		// 고전적 방식
		String method = request.getMethod();
		String uri = request.getRequestURI();
		String queryString = request.getQueryString();
		String type = request.getParameter("type");
		int bno = Integer.parseInt(request.getParameter("bno"));
		String userAgent = request.getHeader("User-Agent");
		String[] hobby = request.getParameterValues("hobby");

		if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
			userAgent = "IE11 이하 브라우저";
		} else if (userAgent.contains("Edge")) {
			userAgent = "엣지 브라우저";
		} else if (userAgent.contains("Chrome")) {
			userAgent = "크롬 브라우저";
		} else {
			userAgent = "사파리 브라우저";
		}
		
		model.addAttribute("method", method);
		model.addAttribute("URI", uri);
		model.addAttribute("qS", queryString);
		model.addAttribute("type", type);
		model.addAttribute("bno", bno);
		model.addAttribute("userAgent", userAgent);
		model.addAttribute("hobby", hobby);

		return "http/exam02";
	}
	// spring 방식
	@RequestMapping("/exam03")
	public String exam03(
		  @RequestParam String type,
		  @RequestParam int bno,
		  @RequestParam String[] hobby,
		  @RequestHeader("User-Agent") String userAgent,
		  Model model){
		model.addAttribute("type", type);
		model.addAttribute("bno", bno);
		model.addAttribute("userAgent", userAgent);
		model.addAttribute("hobby", hobby);
		return "http/exam02";
	}
}
