package ch08.homework01;

public class Driver {
	public void drive(Vehicle vehicle){
		if(vehicle instanceof Bus){
			Bus bus = (Bus)vehicle;
			bus.checkFare();
			bus.run();
		}
		vehicle.run();
	}
}
