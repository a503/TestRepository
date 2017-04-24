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
			field = 10; // B의 필드, 가장 가까운것을 찾아간다.
			A.this.field = 10; // A라고 하는 객체의 this를 이용해 A의 필드 접근, 안드로이드에서 가끔씩 사용
		}
		
	}
}
	
