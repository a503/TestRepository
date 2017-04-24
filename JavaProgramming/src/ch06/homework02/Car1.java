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
		System.out.println("키를 돌립니다.");
	}
	void run(){
		for(int i = 10 ; i <= 50 ; i+=10){
			speed = i;
			System.out.println(this.model + "가 달립니다. (시속 : " + speed + "km/h)");
		}
	}
}
