package ch06.exam01;

public class Car {
	//Field(필드)
	//String company; // 회사명 
	String company = "현대자동차";
	int speed; // 속도
	String color;
	boolean airback;
	
	//Constructor(생성자)
	Car (){
		//System.out.println("Car 객체 생성");
	}
	
	//Method(메소드)
	void run(){
		System.out.println("현재 " + speed + "km/h 로 달립니다.");
	}
}
