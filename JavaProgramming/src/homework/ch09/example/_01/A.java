package homework.ch09.example._01;

public class A {
	A(){
		System.out.println("A ��ü�� ������.");
	}
	// Instance Member Class
	class B{
		int field1;
		// static int field2;
		
		B(){
			System.out.println("B ��ü�� ������.");
		}
		
		void method1(){
			
		}
		//static void method2(){};
	}
	// Static Member Class
	static class C{
		int field1;
		static int field2;
		
		C() {
			System.out.println("C ��ü�� ������.");
		}
		
		void method1(){
			
		}
		static void method2(){
			
		}
	}
	void method(){
		// Local Class
		class D{
			int field1;
			// static int field2;
			
			D(){
				System.out.println("D ��ü�� ������.");
			}
			
			void method1(){
				
			}
			//static void method2(){}
			
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
