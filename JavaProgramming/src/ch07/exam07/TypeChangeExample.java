package ch07.exam07;

public class TypeChangeExample {

	public static void main(String[] args) {
		Tire tire1 = new Tire();
		
		NormalTire tire2 = new NormalTire();
		SnowTire tire3 = new SnowTire();
		//�ڵ� Ÿ�Ժ�ȯ
		tire1 = tire2;
		//���� Ÿ�Ժ�ȯ
		tire2 = (NormalTire)tire1;
		
		//�ڵ� Ÿ�Ժ�ȭ
		tire1 = tire3;
		//���� Ÿ�Ժ�ȭ
		tire3=(SnowTire)tire1;
		
	}
}
