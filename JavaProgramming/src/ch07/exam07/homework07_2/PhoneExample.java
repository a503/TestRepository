package ch07.exam07.homework07_2;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); (x) 추상클래스인 Phone을 이용해 new 연사자로 객체를 생성할 수 없다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); // 상속받은 메소드
		smartPhone.internetSearch(); // 스마트폰 클래스의 메소드.
		smartPhone.turnOff(); // 상속받은 메소드
	}

}
