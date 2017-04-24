package ch08.exam01;

public class Vehicle { // 앞으로 메뉴얼로생성된 객체는 모두 사용가능
	//Field
	private Manual manual; //설명서(interface) 타입 변수
	//Constructor
	Vehicle(Manual manual){ // 어떤 객체가 들어오느냐에 따라 다른 결과 생성
		this.manual = manual;
	}
	//Method
	public void move(){
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
}
