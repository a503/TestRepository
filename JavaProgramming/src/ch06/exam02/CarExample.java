package ch06.exam02;

public class CarExample {

	public static void main(String[] args) {
		Car myCar;
		myCar= new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.color);
		System.out.println(myCar.speed);
		System.out.println(myCar.airback);
		
		// new Car("Black", true); // 생성자를 호출할때 이런식으로 매개값을 주면 매개값의 형식에 일치하는 생성자를 선택하여 객체 생성
		Car yourCar = new Car("Black", true);
		System.out.println(yourCar.company);
		System.out.println(yourCar.color);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.airback);
		
		yourCar = new Car("Red", false); // 이런식으로 참조를 바꿔 상위의 객체는 쓰레기 객체가없어진다.
		System.out.println(yourCar.company);
		System.out.println(yourCar.color);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.airback);
		
	}

}
