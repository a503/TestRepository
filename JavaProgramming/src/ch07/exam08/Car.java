package ch07.exam08;

public class Car {
	//Field 
	private Tire tire; //new Tire(), new NormalTire(), new SnowTire();
	//Constructor
	public Car(Tire tire){
		this.tire = tire;
	}
	//Method
	public void run(){
		this.tire.roll();
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
