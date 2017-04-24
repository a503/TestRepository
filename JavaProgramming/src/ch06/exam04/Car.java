package ch06.exam04;

public class Car {
	//Field
	Body body; // Body body = new Body();
	Engine engine = new Engine();
	Dashboard dashboard = new Dashboard();
	Seat[] seats= { // seat타입 배열에 4개의 Seat 생성
			new Seat(),
			new Seat(),
			new Seat(),
			new Seat()
	};
	Tire[] tires = {
			new Tire("오른쪽 앞"),
			new Tire("왼쪽 앞"),
			new Tire("오른쪽 뒤"),
			new Tire("왼쪽 뒤")
	};
	String makeDay;
	String color;
	int speed; // 상태 데이터 이므로 수시로 변하기때문에 생성자에서 값을 받아오지 않는다.
	//Constructor
	Car(String makeDay, String color){
		this.makeDay = makeDay;
		this.color = color;
	}
	//Method
	void start(){
		engine.start();
	}
	void run(){
		//while(true){
			tires[0].roll();
			tires[1].roll();
			tires[2].roll();
			tires[3].roll();
			
			this.setSpeed(60);
			
			dashboard.display(60);
		//}
	}
	void setSpeed(int speed){
		this.speed = speed;
	}
	void stop(){
		engine.stop();
		this.speed = 0;
	}
}
