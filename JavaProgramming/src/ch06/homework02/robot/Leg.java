package ch06.homework02.robot;

public class Leg {
	//Field
	//Constructor
	//Method
	double moveForward(double location, Energy energy){
		location+=0.5;
		energy.powerLevel -= 10;
		return location;
	}
	double moveBackward(double location, Energy energy){
		location-=0.5;
		energy.powerLevel -= 10;
		return location;
	}
}
