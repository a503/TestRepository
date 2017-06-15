package com.mycompany.myapp;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:WebContent/WEB-INF/spring/applicationContext.xml",
	"file:WebContent/WEB-INF/spring/dispatcher-servlet.xml"
})
@WebAppConfiguration("WebContent") // 웹컨텐트가 src/main/webapp에 존재(sts default) -> 우리와 차이가 있다.
public class ApplicationContextLoader {

}
