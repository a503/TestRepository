package ch08.exam01;

public interface Manual {
	//Field
	//public static final String COMPANY = "SAMSUNG";
	String COMPANY = "SAMSUNG"; // -> public static final ���� ���� �Ƚᵵ �Ȱ��� ���
	int MAX_SPEED = 150;
	int MIN_SPEED = 0;
	//Method ���� �ִ´�
	//public abstract void turnOn();
	void turnOn(); // -> �������̽��� method�� �⺻���� public abstract �̴� �׷��Ƿ� ���� // ����θ� ������ �ȵȴ�.
	void turnOff();
	void setSpeed(int speed);
	int getSpeed();
	void run();
	//���� ������ ��ü���� �̷������. -> �������̽��� ������ ��ü -> �ּ��� �������̽����� �����Ѱ��� ������ �־���Ѵ�.
	
}
