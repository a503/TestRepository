package ch07.exam07.homework07_1._6;

public class Car {
	public int speed;
	public void speedUp(){
		speed += 1;
	}
	//final method
	public final void stop(){
		System.out.println("Â÷¸¦ ¸ØÃã");
		speed = 0;
	}
}
