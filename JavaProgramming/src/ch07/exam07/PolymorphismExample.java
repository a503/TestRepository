package ch07.exam07;

public class PolymorphismExample {

	public static void main(String[] args) {
		Tire tire1 = new Tire();
		
		NormalTire tire2 = new NormalTire(); // Tire ��ӹ���
		SnowTire tire3 = new SnowTire(); // Tire ��ӹ���
		
		run(tire1); // ���� ������ ����
		run(tire2); // Tire tire = tire2 // �ڵ� ����ȯ
		run(tire3); // Tire tire = tire3 // �ڵ� ����ȯ
		
		
	}
	static void run(Tire tire){
		tire.roll();
	}

}
