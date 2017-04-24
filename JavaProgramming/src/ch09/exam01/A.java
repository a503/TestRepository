package ch09.exam01;

public class A {
	// Field
	// Constructor
	A(){
		// 로컬 클래스
		class D{}
		class E{}
	}
	
	// Method
	void method(){
		// 로컬 클래스
		//class E{}
		class D{}
		class E{}
	}
	
	// Nested Class (중첩된 클래스)
	// A라는 객체가 없으면 B를 사용할 수 없다. 인스턴스 멤버 클래스
	class B{}
	// Static A가없어도 C를 사용가능, 정적 멤버 클래스
	static class C{}
}
