package ch07.exam07.homework07_1._7.pack2;

import ch07.exam07.homework07_1._7.pack1.A;

public class D extends A{
	public D(){
		// A a = super(); (x)
		super();
		this.field = "value";
		this.method();
	}
	public void dTest(){
		// A a = new A(); (x)
	}
	// ��� : protected�� �ٸ� ��Ű���� �ִ� Ŭ������ �ش� Ŭ������ ����� �����ϰ� ������ �ݵ�� ����� �޾ƾ� �Ѵ�.
	// �� new�����ڸ� �̿��� �����ڸ� ȣ���� �� ����, �ڽ� �����ڿ��� super()�� �θ��� �����ڸ� ȣ���� �� �ִ�.
	
}
