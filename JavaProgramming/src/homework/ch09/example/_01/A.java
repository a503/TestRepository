package homework.ch09.example._01;

public class A {
	A(){
		System.out.println("A 按眉啊 积己凳.");
	}
	// Instance Member Class
	class B{
		int field1;
		// static int field2;
		
		B(){
			System.out.println("B 按眉啊 积己凳.");
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
			System.out.println("C 按眉啊 积己凳.");
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
				System.out.println("D 按眉啊 积己凳.");
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
