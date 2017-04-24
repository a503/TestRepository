package ch06.homework02;

public class Car1Example {

	public static void main(String[] args) {
		/* Car1 myCar = new Car1();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("ÇöÀç ¼Óµµ : " + speed + "km/h"); */
		
		Car1 myCar = new Car1("Æ÷¸£½¦");
		Car1 yourCar = new Car1("º¥Ã÷");
		
		myCar.run();
		yourCar.run();

	}

}
