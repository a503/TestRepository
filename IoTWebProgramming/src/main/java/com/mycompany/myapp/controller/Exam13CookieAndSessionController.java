package com.mycompany.myapp.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.mycompany.myapp.dto.Exam13Member;

@Controller
@SessionAttributes(value={"name1", "name2", "member"}) // 지정한 key들은 session에 사용해야할 key들이다.
public class Exam13CookieAndSessionController {
	private static final Logger LOGGER = LoggerFactory.getLogger(Exam13CookieAndSessionController.class);
	
	@RequestMapping("/cookie/exam01")
	public String exam01(HttpServletResponse response) throws UnsupportedEncodingException{
		// cookie create
		Cookie cookie1 = new Cookie("name1", "hong"); // cookie의 이름과 값을 줄때 주의 할점-> 반드시 아스키 문자여야만 한다.
		String name2 = "홍";
		name2 = URLEncoder.encode(name2, "UTF-8"); // URL Encoding, 복원할때도 같은 문자셋으로 복원해야한다.
		Cookie cookie2 = new Cookie("name2", name2);
		cookie2.setMaxAge(30*24*60*60); // 단위 
		// cookie 응답 헤더에 추가
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		return "cookie/exam01";
	}
	/* 방법1
	@RequestMapping("/cookie/exam02")
	public String exam02(HttpServletRequest request, Model model) throws UnsupportedEncodingException{
		String name1 = null;
		String name2 = null;
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("name1")){
				name1 = cookie.getValue();
			}else if(cookie.getName().equals("name2")){
				name2 = cookie.getValue();
				name2 = URLDecoder.decode(name2, "UTF-8");
			}
		}
		model.addAttribute("name1", name1);
		model.addAttribute("name2", name2);
		return "cookie/exam02";
	}*/
	// 방법2
	@RequestMapping("/cookie/exam02")
	public String exam02(@CookieValue(defaultValue="") String name1, @CookieValue(defaultValue="") String name2, Model model) 
			throws UnsupportedEncodingException{ // @CookieValue => 매개변수의 이름이 쿠키의 key가 된다.// 자동으로 decoding도 된다.
		model.addAttribute("name1", name1);
		model.addAttribute("name2", name2);
		return "cookie/exam02";
	}
	@RequestMapping("/cookie/exam03")
	public String exam03(HttpServletResponse response){ // cookie 삭제
		Cookie cookie1 = new Cookie("name1", "");
		Cookie cookie2 = new Cookie("name2", "");
		
		cookie1.setMaxAge(0);
		cookie2.setMaxAge(0);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "redirect:/";
	}
	/*
	@RequestMapping("/session/exam04")
	public String exam04(HttpSession session){ // session 객체가 자동으로 저장된다
		// 세션에 문자열 정보를 저장
		session.setAttribute("name1", "hong");
		session.setAttribute("name2", "홍");
		
		// 세션에 객체를 저장
		Exam13Member member = new Exam13Member();
		member.setMname("스프링");
		session.setAttribute("member", member);
		
		return "redirect:/";
	}*/
	@RequestMapping("/session/exam04")
	public String exam04(Model model){
		model.addAttribute("name1", "hong");
		model.addAttribute("name2", "홍");
		
		Exam13Member member = new Exam13Member();
		member.setMname("스프링");
		model.addAttribute("member", member);
		
		
		return "redirect:/";
	}
	/*
	@RequestMapping("/session/exam05")
	public String exam05(HttpSession session){
		// 세션에서 문자열 정보 가져오기
		String name1 = (String)session.getAttribute("name1");
		String name2 = (String)session.getAttribute("name2");
		
		Exam13Member member = (Exam13Member)session.getAttribute("member");
		
		LOGGER.debug(name1);
		LOGGER.debug(name2);
		LOGGER.debug(member.getMname());
		
		return "session/exam05";
	}*/
	@RequestMapping("/session/exam05")
	public String exam05(
			@ModelAttribute String name1,
			@ModelAttribute String name2,
			@ModelAttribute Exam13Member member){ // @ModelAttribute는 세션에서 key가 일치한다면 정보를 세션에서 가져와라
		return "session/exam05";
	}
	
	/*@RequestMapping("/session/exam06")
	public String exam06(HttpSession session){ // @ModelAttribute는 세션에서 key가 일치한다면 정보를 세션에서 가져와라
		session.removeAttribute("name1");
		session.removeAttribute("name2");
		session.removeAttribute("member");
		
		return "redirect:/";
	}*/
	@RequestMapping("/session/exam06")
	public String exam06(SessionStatus sessionStatus){
		sessionStatus.setComplete();
		return "redirect:/";
	}
	
}
