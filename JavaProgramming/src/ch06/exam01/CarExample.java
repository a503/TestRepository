package ch06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// new Car(); // 생성은 되지만 이 객체를 가르킬 참조 타입 변수가 없다
		Car myCar = new Car(); // 객체 생성 코드
		myCar.run(); //객체의 메소드 호출
		
		//객체의 필드의 값을 출력
		System.out.println(myCar.company); // 입력 한 값이 나온다.
		System.out.println(myCar.color); // null
		System.out.println(myCar.speed); // 0
		System.out.println(myCar.airback); // false
		
		//객체의 필드값을 변경
		myCar.speed = 30;
		myCar.color = "흰색";
		myCar.run(); // 필드값 변경확인.
		
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		//-----------------------------------------------
		Car yourCar = new Car(); // 객체가 달라지면 객체가 가지고 있는 데이터도 당연히 다르다.
		
		System.out.println(yourCar.company);
		System.out.println(yourCar.color);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.airback);
	}

}
