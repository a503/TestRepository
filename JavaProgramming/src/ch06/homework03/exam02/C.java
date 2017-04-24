package ch06.homework03.exam02;

import ch06.homework03.exam01.*;

public class C {
	// A a; 클래스가 default로 설정되어있기 때문에 다른 클래스에서 접근불가
	public C(){
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();
		//a.method2();
		//a.method3();
	}
}
