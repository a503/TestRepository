package ch08.exam01;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle(new Bike()); // <- Vehicle�̶�� Ŭ������ ������ �ʰ� �پ��� ��� ���� 
		vehicle1.move(); // �ᱹ�� ����ũ�� move()�޼ҵ� ����
		
		Vehicle vehicle2 = new Vehicle(new Car());
		vehicle2.move();
	}

}
