package homework.ch09.example._02;

public class A {
	//instance field
	B field1 = new B();
	C field2 = new C();
	
	//static field
	// static B field3 = new B(); // B�� �ν��Ͻ� Ŭ�����̱� ������ A��ü�� ���ؼ� �����ؾ��ϴµ� A��ü�� ���� �������� �������Ƿ� ������ ���� �߻�
	static C field4 = new C();
	
	//instance Method
	void method1(){
		B var1 = new B();
		C var2 = new C();
	}
	static void method2(){
		//B var1 = new B(); // �̰� ���� A��ü�� ������ ���ٰ���
		C var2 = new C();
	}
	
	
	class B{
		
	}
	static class C {
		
	}
}
