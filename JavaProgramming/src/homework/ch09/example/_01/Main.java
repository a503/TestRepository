package homework.ch09.example._01;

public class Main {

	public static void main(String[] args) {
		A a = new A(); // �翬�� Ŭ���� ������
		
		// Instance Member class ��ü ����
		A.B b = a.new B(); // �ν��Ͻ� Ŭ���� B�� ��ü A�� �־�� �ϹǷ� ��ü A�� ����Ű�� a�� �����ؼ� ������ ȣ��
		b.field1 = 3; // class B�� field;
		b.method1(); // class B�� method1
		
		// Static Member class ��ü����
		A.C c = new A.C(); // ���� ��� Ŭ���� �̹Ƿ� �ش� ����Ŭ������ �̸������ε� �����ؼ� ����� �� �ִ�
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3; // static�ʵ��̹Ƿ� ��ü���̵� ���� ����
		A.C.method2();
		
		// A�� �޼ҵ带 ȣ���� ���� Ŭ������ ��ü�� �����Ѵ�.
		a.method();

	}

}
