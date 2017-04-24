package ch06.exam03;

public class Car {
	//Field(필드)
	//String company; // 회사명 
	String company = "현대자동차";
	int speed; // 속도
	String color;
	boolean airback;
	
	//Constructor(생성자)
	Car (){
		this("현대자동차",null, false);
	}
	Car (String color, boolean airback){ // 보통 설계할때는 필드명과 매개변수명을 일치시킨다.
		this("현대자동차", color, airback);
	}
	Car (String company, String color, boolean airback){
		this.company = company;
		this.color = color;
		this.airback = airback;
	}
	
	
	//Method(메소드)
	void run(){
		System.out.println("현재 " + speed + "km/h 로 달립니다.");
	}
}
