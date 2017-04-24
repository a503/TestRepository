package ch06.exam07;

public class Calculator {
	//field
	static String model = "MI-84";
	static String makeDay = "2017-03-29";
	
	static String info; // "MI-84(2017-03-29)"
	static{
		// 
		info = model;
		info +="(";
		info += makeDay;
		info += ")";
	}
	
	//method
	
}
