package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener{/*context가 deploy될때를 감지하고 있다가 감지되면 initialize실행, undeploy이 될때 destroyed실*/

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("ContextLoaderListener - contextDestroyed()");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("ContextLoaderListener - contextInitialized");
		
		String key1 = event.getServletContext().getInitParameter("key1"); // web application의 객체를 얻어 초기화 값을 얻겠다
		
		System.out.println(key1);
	}
	
}
