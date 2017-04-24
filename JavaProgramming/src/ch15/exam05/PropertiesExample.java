package ch15.exam05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		
		String path = PropertiesExample.class.getResource("../exam04/database.properties").getPath();
		prop.load(new FileReader(path));
		
		/*
		prop.load(new FileReader("D:/IotCourse/EclipseWorkspace/JavaProgramming/src/ch15/exam05/database.properties"));
		*/
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String manager = prop.getProperty("manager");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("manager : " + manager);
	}
}
