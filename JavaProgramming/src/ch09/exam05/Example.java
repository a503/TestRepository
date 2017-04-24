package ch09.exam05;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b = new B(); // B는 A없이는 단독으로 사용할 수 없다.
		A a = new A();
		//A.B b = a.new B();
		A.B b = a.new B();
		b.method();
		
		A.C c = new A.C(); // C 같은 경우는 static이 붙어있기 때문에 A가 없어도 어디 클래스 안에 있는지만 알려주면 된다.
	}

}
