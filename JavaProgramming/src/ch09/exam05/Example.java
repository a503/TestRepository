package ch09.exam05;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b = new B(); // B�� A���̴� �ܵ����� ����� �� ����.
		A a = new A();
		//A.B b = a.new B();
		A.B b = a.new B();
		b.method();
		
		A.C c = new A.C(); // C ���� ���� static�� �پ��ֱ� ������ A�� ��� ��� Ŭ���� �ȿ� �ִ����� �˷��ָ� �ȴ�.
	}

}
