package ch07.exam07.homework07_1._13;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // �ڵ� ����ȯ
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * field2 �� method3()�� Child Ÿ�Կ��� ����Ǿ� �����Ƿ�
		 * Parent Ÿ������ �ڵ� Ÿ�� ��ȯ�ϸ� ����� �� ����.
		parent.field2 = "data2";
		parent.method3();
		*/
		
		// Child�� ������ ����ȯ�ؼ� field2�� method3 ���
		// �̷������δ� ���� ������� �ʴ´�.
		Child child = (Child)parent;
		child.field2 = "data2";
		child.method3();
	}

}
