package homework.ch09.check;

public class Anonymous {
	Vehicle vehicle = new Vehicle(){
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
	
	void method1(){
		Vehicle vehicle = new Vehicle(){
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		vehicle.run();
	}
	void method2(Vehicle vehicle){
		vehicle.run();
	}
}
