package ch06.homework02;

public class Car1 {
	//Field
	int speed;
	String model;
	//Constructor
	Car1(String model){
		this.model = model;
	}
	//Method
	int getSpeed(){
		return speed;
	}
	void setSpeed(int speed){
		this.speed = speed;
	}
	void keyTurnOn(){
		System.out.println("Ű�� �����ϴ�.");
	}
	void run(){
		for(int i = 10 ; i <= 50 ; i+=10){
			speed = i;
			System.out.println(this.model + "�� �޸��ϴ�. (�ü� : " + speed + "km/h)");
		}
	}
}
