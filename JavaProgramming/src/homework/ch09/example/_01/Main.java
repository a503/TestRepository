package homework.ch09.example._01;

public class Main {

	public static void main(String[] args) {
		A a = new A(); // 당연한 클래스 생성법
		
		// Instance Member class 객체 생성
		A.B b = a.new B(); // 인스턴스 클래스 B는 객체 A가 있어야 하므로 객체 A를 가르키는 a로 접근해서 생성자 호출
		b.field1 = 3; // class B의 field;
		b.method1(); // class B의 method1
		
		// Static Member class 객체생성
		A.C c = new A.C(); // 정적 멤버 클래스 이므로 해당 정적클래스의 이름만으로도 접근해서 사용할 수 있다
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3; // static필드이므로 객체없이도 접근 가능
		A.C.method2();
		
		// A의 메소드를 호출해 로컬 클래스의 객체를 생성한다.
		a.method();

	}

}
