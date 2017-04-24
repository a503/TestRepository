package homework.ch09.check;

public class Anonymous {
	Vehicle vehicle = new Vehicle(){
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1(){
		Vehicle vehicle = new Vehicle(){
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		vehicle.run();
	}
	void method2(Vehicle vehicle){
		vehicle.run();
	}
}
