package ch06.exam02;

public class CarExample {

	public static void main(String[] args) {
		Car myCar;
		myCar= new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.color);
		System.out.println(myCar.speed);
		System.out.println(myCar.airback);
		
		// new Car("Black", true); // �����ڸ� ȣ���Ҷ� �̷������� �Ű����� �ָ� �Ű����� ���Ŀ� ��ġ�ϴ� �����ڸ� �����Ͽ� ��ü ����
		Car yourCar = new Car("Black", true);
		System.out.println(yourCar.company);
		System.out.println(yourCar.color);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.airback);
		
		yourCar = new Car("Red", false); // �̷������� ������ �ٲ� ������ ��ü�� ������ ��ü����������.
		System.out.println(yourCar.company);
		System.out.println(yourCar.color);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.airback);
		
	}

}
