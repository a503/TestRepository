package ch08.homework01;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); -> Vehicle�� checkFare�� �˼������� ����ų�� ����.
		
		Bus bus = (Bus)vehicle; //<- ���� ����ȯ
		
		bus.run();
		bus.checkFare(); //���� ����ȯ�� �߱⶧���� checkFare�� ����ų�� �ִ�.

	}

}
