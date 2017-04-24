package ch06.homework03;

public class Singleton {
	// Singleton singleton = new Singleton(); // 2�� Ŭ���� �����̹Ƿ� ��ü��������
	//static Singleton singleton = new Singleton(); // 4�� �����޼ҵ忡�� �ʵ尪�� �����ϱ����� �ʵ带 ����ؾ��ϹǷ� �ʵ� ���� ���� �ʵ�� ����
	private static Singleton singleton = new Singleton(); // 5�� �ܺο��� static�ʵ忡 ���������� �������� private���� 
	
	private Singleton(){} // 1��
	
	static Singleton getInstance(){ // 3�� ��ü�� �ּҰ��� ��ȯ�ϴ� �޼ҵ带 �����Ѵ�. ������ �ܺο��� ��ü�� �����Ҽ� �����Ƿ� �� �޼ҵ忡 ������ �� ����.
								// �׷��Ƿ� �ܺο��� �� �޼ҵ忡 ��ü���� ������ �� ������ static �޼ҵ�� ����
		return singleton;
	}
}
