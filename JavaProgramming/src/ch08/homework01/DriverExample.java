package ch08.homework01;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//� ��ü�� �Ű������� �Ѱ��ִ��Ŀ� ���� ������ ��� �߻�
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
