package ch08.exam01;

public class ManualExample {

	public static void main(String[] args) {
		//Manual manual = new Bike(); //인터페이스를 가지고 사용, 그리고 실행부가 있는 객체를 대입해준다. // 메뉴얼이라는 인터페이스로 바이크 생성...(?)
		
		//Manual manual;
		
		move(new Bike());
	
		
		
		/*
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
		
		manual = new Car();
		
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
		*/
		
		/*
		Car car = (Car)manual;
		car.test();
		*/
	}
	/*
	public static void move(Bike bike){
		
	}
	public static void move(Car car){
		
	}
	*/ // 탈것이 100개 이상이면 다칠거임? 비효율적인 위의 코드를 다형성으로 구현
	public static void move(Manual manual){ // Manual 인터페이스로 구현된 객체는 아무거나 와도 된다.
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
	

}
