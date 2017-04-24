package ch08.homework01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println();
		
		myCar.flTire = new KumhoTire();
		myCar.frTire = new KumhoTire();
		
		myCar.run();

	}

}
