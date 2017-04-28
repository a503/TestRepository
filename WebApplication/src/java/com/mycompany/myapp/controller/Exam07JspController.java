package com.mycompany.myapp.controller;

import com.mycompany.myapp.dto.Board;
import com.mycompany.myapp.dto.Member;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class Exam07JspController {

	@RequestMapping("/exam01")
	public String exam01() {
		return "jsp/exam01";
	}

	@RequestMapping("/exam02")
	public String exam02() {
		return "jsp/exam02";
	}

	@RequestMapping("/exam03")
	public String exam03() {
		return "jsp/exam03";
	}

	@RequestMapping("/exam04")
	public String exam04(Model model) { // spring에서 Model은 데이터를 의미한다. 컨트롤러에 데이터 있으니깐 JSP에서 데이터를 받아라
		// HttpServletRequest -> 웹 클라이언트에 요청정보만을 가지고 있는 객체 // 데이터를 전달하는데 용어상 직관적이지 않다, 그러므로 데이터를 의미하는 모델을 사용하는게 일반적인 경우
		model.addAttribute("name2", "name2");
		model.addAttribute("member2", new Member("name2_Attr", 30)); // controller에서 JSP로 데이터로 넘겨준다.
		return "jsp/exam04";
	}

	@RequestMapping("/exam05")
	public String exam05(Model model) {
		model.addAttribute("name3", "홍길동_name3");
		model.addAttribute("member3", new Member("홍길동_member3", 30));

		Board board = new Board();
		board.setBno(0);
		board.setBtitle("오늘은 휴가 전날");
		board.setBcontent("휴가 때 과제할 내용 굳굳");
		board.setBwriter("강현규");
		board.setBdate(new Date());
		model.addAttribute("board", board);

		List<Board> list = new ArrayList<Board>();

		for (int i = 1; i <= 10; i++) {
			Board b = new Board();
			b.setBno(i);
			b.setBtitle("Title " + i);
			b.setBcontent("Content " + i);
			b.setBwriter("Writer " + i);
			b.setBdate(new Date());
			list.add(b);
		}
		model.addAttribute("list", list);

		return "jsp/exam05";
	}
}
