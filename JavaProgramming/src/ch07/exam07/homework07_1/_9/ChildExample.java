package ch07.exam07.homework07_1._9;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // �ڵ� Ÿ�� ��ȯ
		// Child ��ü�� �ּҰ��� Child Ÿ���� child������ �����ϰ� �� ���� Parent Ÿ���� parent������ �ּҰ��� �־��� ����
		parent.method1();
		parent.method2(); // <- �����ǵ� �޼ҵ�, �޼ҵ尡 �ڽĿ����� ������ �Ǹ� �θ��� �޼ҵ�� ��������
		
		// parent.method3(); (x) Ÿ�Ժ�ȯ�� �����̱� ������ parent�����δ� child��ü�� �޼ҵ�� ������ �� ����.
		// child.method3(); (o) Ÿ�Ժ�ȭ�������� ������ ����ϸ� ���������� child��ü�� �޼ҵ� ���� ����
		
		child.method1(); // ��ӹ��� �θ��� �޼ҵ� ���
		child.method2(); // �θ��� �޼ҵ带 ������ �Ͽ� ���
		child.method3(); // �ڽ��� �޼ҵ� ���

	}

}
