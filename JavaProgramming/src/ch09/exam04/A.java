package ch09.exam04;

public class A {
	
	int field;
	
	// nested Class
	class B{
		// field
		int field;
		// Constructor
		// method
		void method(){
			field = 10; // B�� �ʵ�, ���� �������� ã�ư���.
			A.this.field = 10; // A��� �ϴ� ��ü�� this�� �̿��� A�� �ʵ� ����, �ȵ���̵忡�� ������ ���
		}
		
	}
}
	
