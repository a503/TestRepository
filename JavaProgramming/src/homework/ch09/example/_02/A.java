package homework.ch09.example._02;

public class A {
	//instance field
	B field1 = new B();
	C field2 = new C();
	
	//static field
	// static B field3 = new B(); // B는 인스턴스 클래스이기 때문에 A객체를 통해서 접근해야하는데 A객체는 아직 생성되지 못했으므로 컴파일 에러 발생
	static C field4 = new C();
	
	//instance Method
	void method1(){
		B var1 = new B();
		C var2 = new C();
	}
	static void method2(){
		//B var1 = new B(); // 이것 역시 A객체를 생성후 접근가능
		C var2 = new C();
	}
	
	
	class B{
		
	}
	static class C {
		
	}
}
