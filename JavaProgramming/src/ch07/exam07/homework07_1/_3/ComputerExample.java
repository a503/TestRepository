package ch07.exam07.homework07_1._3;

public class ComputerExample {
	// int r = 10; main�޼ҵ尡 �ִ� Ŭ�������� Ŭ������� ��밡��
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calc = new Calculator(); // �θ��� ��ü ����
		System.out.println("������ : " + calc.areaCircle(r)); //�θ��� �޼ҵ� �̴�. �θ��� ��ü�� �����߱⶧���� �ڽ��� ���� ��ü���� ����.
		System.out.println();
		
		Computer calcComputer = new Computer();
		System.out.println("������ : " + calcComputer.areaCircle(r)); //�ڽ��� �����ǵ� �޼ҵ��̴�. �޼ҵ尡 �������̵��Ǹ� �θ��� �޼ҵ�� ��������.
		System.out.println();
		
		System.out.println("������ : " + calcComputer.superAreaCircle(r)); // �ڽĿ��� �������̵��� �θ��� �޼ҵ忡 �����ϴ� �޼ҵ带 �����Ͽ� ������ �θ�޼ҵ带 ���
	}

}
