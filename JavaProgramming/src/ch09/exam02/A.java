package ch09.exam02;

public class A {
	// Field
	int aField; // A 객체가 있어 사용가능
	// Constructor
	A(){
		// 로컬 클래스
		class D{
			//field
			//constructor
			//method
			void dMethod(){
				aField = 10;
			}
		}
	}
	
	// Method
	void aMethod(){
			// 로컬 클래스
			class E{
				//field
				//constructor
				//method
				void eMethod(){
					aField = 10;
			}
			//class D{}
			//class E{}
		}
	}
	
	// Nested Class (중첩된 클래스)
	// A라는 객체가 없으면 B를 사용할 수 없다. 인스턴스 멤버 클래스
	class B{
		//field
		//constructor
		//method
		void bMethod(){
			aField = 10;
		}
	}
	// Static A가없어도 C를 사용가능, 정적 멤버 클래스
	static class C{
		void cMethod(){
			//aField = 10;
		}
	}
}
