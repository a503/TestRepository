package ch06.homework02;

public class Car {
	//Field
	String company = "Hyundai";
	String model = "�׷���";
	String color = "Black";
	int maxSpeed = 350;
	int speed;
	//int cc;
	
	//Constructor
	Car(){
		
	}
	/*
	 Car(String color, int cc){
	}
	*/
	//Constructor Overloading
	Car(String model){
		//this.model = model;
		this(model, "����", 250);
	}
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
