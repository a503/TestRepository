package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	//field
	private String characterSet;
	
	// servlet과 유사한 형태를 가진다.
	@Override // 처음에 한번실행
	public void init(FilterConfig filterConfig) throws ServletException {
		// 초기화 역할
		System.out.println("CharacterEncodingFilter - init()"); //	메소드가 실행되는지 확인
		characterSet = filterConfig.getInitParameter("encoding"); // init-param의 사용한 값 가져오기.
	}

	@Override // 요청마다 실행
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		//System.out.println("CharacterEncodingFilter - doFilter()"); //	메소드가 실행되는지 확인
		// 전처리(servlet이 시작하기 전에 처리 : 요청 처리전)
		System.out.println("CharacterEncodingFilter - doFilter() - 전처리"); //	전처리 확인
		request.setCharacterEncoding(characterSet);
		//--------------------------------------------------------------------------------------
		filterChain.doFilter(request, response);
		//--------------------------------------------------------------------------------------		
		// 후처리(servlet이 실행한 후에 처리한다 : 요청 처리후, 응답을 보내기전)
		System.out.println("CharacterEncodingFilter - doFilter() - 후처리"); //	후처리 확인
	}

	
	@Override 
	public void destroy() {
		System.out.println("CharacterEncodingFilter - destroy()"); //	메소드가 실행되는지 확인
	}
}
