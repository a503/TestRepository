package ch07.exam07;

public class PolymorphismExample {

	public static void main(String[] args) {
		Tire tire1 = new Tire();
		
		NormalTire tire2 = new NormalTire(); // Tire 상속받음
		SnowTire tire3 = new SnowTire(); // Tire 상속받음
		
		run(tire1); // 가능 지극히 정상
		run(tire2); // Tire tire = tire2 // 자동 형변환
		run(tire3); // Tire tire = tire3 // 자동 형변환
		
		
	}
	static void run(Tire tire){
		tire.roll();
	}

}
