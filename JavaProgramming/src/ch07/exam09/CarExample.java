package ch07.exam09;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car(new SnowTire());
		Car car2 = new Car(new NormalTire());
		
		//SnowTire
		car1.run();
		
		//NormalTire
		car2.run();
		
	}

}
