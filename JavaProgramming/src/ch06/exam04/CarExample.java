package ch06.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("2017-03-28", "검정");
		//Engine의 메소드 호출 // start
		myCar.engine.start();
		//Dashboard method call
		myCar.dashboard.display(60);
		//Tire location(오른쪽 앞 바퀴) field value Read
		System.out.println(myCar.tires[0].location);
		//Tire method call
		myCar.tires[2].roll();
		//Car의 메소드 호출
		myCar.start(); // Car의 start()는 engine.start()를 호출
		myCar.run();
		//Engine의 메소드 호출 // stop
		myCar.engine.stop();
		
		//------------------------------------------------------
		//부품 교체
		myCar.tires[1] = new Tire("(new)왼쪽 앞");
		System.out.println("\n");
		myCar.run();
		//-------------------------------------------------------
		
	}

}
