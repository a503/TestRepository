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
		
		// 자동 타입변환 된다. 큰(A)곳에 작은(B, C, D, E)들이 들어 온다. B, C, D, E는 상속관계이기 때문에 A와 상하위 관계가 생긴다. 
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속 관계가 없는 클래스 들이다. 컴파일 에러 발생
		// B b3 = e;
		// C c2 = d;
		
		
		

	}

}
