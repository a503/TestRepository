package ch06.homework03;

public class Car {
	int speed;
	void run(){
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//speed = 60; // �����߻� main�޼ҵ�� �������� ����Ǿ��ִ�. �׷��Ƿ� Ŭ������ �ν��Ͻ� �ʵ�� �������Ұ���
		//run();
		Car myCar = new Car(); // �ν��Ͻ� �ʵ尡 �޸𸮿� �����Ǵ� ��ü���������� ��Ȯ�� �˾ƾ� �Ѵ�.
		myCar.speed = 60;
		myCar.run();
	}

}
