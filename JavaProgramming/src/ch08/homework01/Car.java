package ch08.homework01;

public class Car {
	Tire flTire = new HankookTire();
	Tire frTire = new HankookTire();
	Tire blTire = new HankookTire();
	Tire brTire = new HankookTire();
	
	void run(){
		flTire.roll();
		frTire.roll();
		blTire.roll();
		brTire.roll();
	}
}
