package ch08.exam01;

public interface Manual {
	//Field
	//public static final String COMPANY = "SAMSUNG";
	String COMPANY = "SAMSUNG"; // -> public static final 보통 생략 안써도 똑같은 기능
	int MAX_SPEED = 150;
	int MIN_SPEED = 0;
	//Method 설명만 넣는다
	//public abstract void turnOn();
	void turnOn(); // -> 인터페이스의 method는 기본으로 public abstract 이다 그러므로 생략 // 실행부를 가지면 안된다.
	void turnOff();
	void setSpeed(int speed);
	int getSpeed();
	void run();
	//실제 실행은 객체에서 이루어진다. -> 인터페이스를 구현한 객체 -> 최소한 인터페이스에서 구현한것을 가지고 있어야한다.
	
}
