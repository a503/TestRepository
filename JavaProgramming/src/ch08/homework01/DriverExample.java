package ch08.homework01;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//어떤 객체를 매개값으로 넘겨주느냐에 따라 다향한 결과 발생
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
