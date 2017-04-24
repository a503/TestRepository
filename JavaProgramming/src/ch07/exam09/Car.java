package ch07.exam09;

public class Car {
	//Field 
	private Tire tire; //new Tire(), new NormalTire(), new SnowTire();
	//private SnowTire sTire;
	//Constructor
	public Car(Tire tire){
		this.tire = tire;
	}
	//Method
	public void run(){
		this.tire.roll();
		if(tire instanceof SnowTire){
			SnowTire snowTire = (SnowTire) tire;
			snowTire.notSlide();
		}
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
}
