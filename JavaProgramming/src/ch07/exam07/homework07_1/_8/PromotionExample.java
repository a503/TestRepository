package ch07.exam07.homework07_1._8;

class A{}

class B extends A {}
class D extends B {}

class C extends A {}
class E extends C {}

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// �ڵ� Ÿ�Ժ�ȯ �ȴ�. ū(A)���� ����(B, C, D, E)���� ��� �´�. B, C, D, E�� ��Ӱ����̱� ������ A�� ������ ���谡 �����. 
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// ��� ���谡 ���� Ŭ���� ���̴�. ������ ���� �߻�
		// B b3 = e;
		// C c2 = d;
		
		
		

	}

}
