package ch06.homework03;

public class Car {
	int speed;
	void run(){
		System.out.println(speed + "으로 달립니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//speed = 60; // 에러발생 main메소드는 스택으로 선언되어있다. 그러므로 클래스의 인스턴스 필드는 직접사용불가능
		//run();
		Car myCar = new Car(); // 인스턴스 필드가 메모리에 생성되는 객체생성시점을 정확히 알아야 한다.
		myCar.speed = 60;
		myCar.run();
	}

}
