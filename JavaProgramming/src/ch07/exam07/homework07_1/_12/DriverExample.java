package ch07.exam07.homework07_1._12;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle(); // Vehicle타입의 매개변수에 Vehicle객체의 주소값을 준다. 지극히 당연하다.
		driver.drive(vehicle);
		
		// Vehicle을 상속받은 클래스들의 instance 생성
		Bus bus = new Bus();	
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// 자동 타입 변환 발생
		driver.drive(taxi);
		// 자식클래스에서 부모의 메소드를 오버라이드하여 다형성 테스트
		//
	}

}
