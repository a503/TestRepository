package ch06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// new Car(); // ������ ������ �� ��ü�� ����ų ���� Ÿ�� ������ ����
		Car myCar = new Car(); // ��ü ���� �ڵ�
		myCar.run(); //��ü�� �޼ҵ� ȣ��
		
		//��ü�� �ʵ��� ���� ���
		System.out.println(myCar.company); // �Է� �� ���� ���´�.
		System.out.println(myCar.color); // null
		System.out.println(myCar.speed); // 0
		System.out.println(myCar.airback); // false
		
		//��ü�� �ʵ尪�� ����
		myCar.speed = 30;
		myCar.color = "���";
		myCar.run(); // �ʵ尪 ����Ȯ��.
		
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		//-----------------------------------------------
		Car yourCar = new Car(); // ��ü�� �޶����� ��ü�� ������ �ִ� �����͵� �翬�� �ٸ���.
		
		System.out.println(yourCar.company);
		System.out.println(yourCar.color);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.airback);
	}

}
