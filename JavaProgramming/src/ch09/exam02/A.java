package ch09.exam02;

public class A {
	// Field
	int aField; // A ��ü�� �־� ��밡��
	// Constructor
	A(){
		// ���� Ŭ����
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
			// ���� Ŭ����
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
	
	// Nested Class (��ø�� Ŭ����)
	// A��� ��ü�� ������ B�� ����� �� ����. �ν��Ͻ� ��� Ŭ����
	class B{
		//field
		//constructor
		//method
		void bMethod(){
			aField = 10;
		}
	}
	// Static A����� C�� ��밡��, ���� ��� Ŭ����
	static class C{
		void cMethod(){
			//aField = 10;
		}
	}
}
