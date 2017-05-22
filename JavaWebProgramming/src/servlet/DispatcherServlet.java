package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("dispatcherservlet - init()");
		
		String name1 = config.getInitParameter("name1"); //key 이름으로 값을 가져오는 형태 -> web.xml에서 init-param의 값을 가져오는것
		String name2 = config.getInitParameter("name2");
		
		System.out.println(name1);
		System.out.println(name2);
		
		// client가 최초로 요청했을때 한번만 실행된다.
		// 초기 servlet이 생성될때 초기값으로 주어져야 할때.
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DispatcherServlet - service() 실행");
	}
}
