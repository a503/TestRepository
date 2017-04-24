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
	// 결론 : protected는 다른 패키지에 있는 클래스가 해당 클래스의 멤버에 접근하고 싶으면 반드시 상속을 받아야 한다.
	// 단 new연산자를 이용해 생성자를 호출할 수 없고, 자식 생성자에서 super()로 부모의 생성자를 호출할 수 있다.
	
}
