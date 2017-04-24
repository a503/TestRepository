package homework.ch09.example._03;

public class A {

	int field1;
	void method1(){}
	
	static int field2;
	static void method2(){}
	
	class B{
		void method(){
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	static class C{
		void method(){
			//field1 = 10;
			//method1();
			// static member class에서는 인스턴스 필드,메소드에 접근할수 없다.
			// 당연히 A의 객체가 생성되지 않았으므로
			
			field2 = 10;
			method2();
		}
	}

}
