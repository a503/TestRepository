package ch08.exam01;

public class ManualExample {

	public static void main(String[] args) {
		//Manual manual = new Bike(); //�������̽��� ������ ���, �׸��� ����ΰ� �ִ� ��ü�� �������ش�. // �޴����̶�� �������̽��� ����ũ ����...(?)
		
		//Manual manual;
		
		move(new Bike());
	
		
		
		/*
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
		
		manual = new Car();
		
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
		*/
		
		/*
		Car car = (Car)manual;
		car.test();
		*/
	}
	/*
	public static void move(Bike bike){
		
	}
	public static void move(Car car){
		
	}
	*/ // Ż���� 100�� �̻��̸� ��ĥ����? ��ȿ������ ���� �ڵ带 ���������� ����
	public static void move(Manual manual){ // Manual �������̽��� ������ ��ü�� �ƹ��ų� �͵� �ȴ�.
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
	

}
