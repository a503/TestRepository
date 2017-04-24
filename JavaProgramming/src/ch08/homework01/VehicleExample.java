package ch08.homework01;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); -> Vehicle은 checkFare를 알수가없어 가르킬수 없다.
		
		Bus bus = (Bus)vehicle; //<- 강제 형변환
		
		bus.run();
		bus.checkFare(); //강제 형변환을 했기때문에 checkFare를 가르킬수 있다.

	}

}
