package ch08.exam01;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle(new Bike()); // <- Vehicle이라는 클래스는 변하지 않고 다양한 결과 생성 
		vehicle1.move(); // 결국은 바이크의 move()메소드 실행
		
		Vehicle vehicle2 = new Vehicle(new Car());
		vehicle2.move();
	}

}
