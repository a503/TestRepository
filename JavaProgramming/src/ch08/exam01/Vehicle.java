package ch08.exam01;

public class Vehicle { // ������ �޴���λ����� ��ü�� ��� ��밡��
	//Field
	private Manual manual; //����(interface) Ÿ�� ����
	//Constructor
	Vehicle(Manual manual){ // � ��ü�� �������Ŀ� ���� �ٸ� ��� ����
		this.manual = manual;
	}
	//Method
	public void move(){
		manual.turnOn();
		manual.setSpeed(10);
		manual.run();
		manual.turnOff();
	}
}
