package ch07.exam07.homework07_1._12;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle(); // VehicleŸ���� �Ű������� Vehicle��ü�� �ּҰ��� �ش�. ������ �翬�ϴ�.
		driver.drive(vehicle);
		
		// Vehicle�� ��ӹ��� Ŭ�������� instance ����
		Bus bus = new Bus();	
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// �ڵ� Ÿ�� ��ȯ �߻�
		driver.drive(taxi);
		// �ڽ�Ŭ�������� �θ��� �޼ҵ带 �������̵��Ͽ� ������ �׽�Ʈ
		//
	}

}
