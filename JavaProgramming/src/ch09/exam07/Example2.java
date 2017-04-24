package ch09.exam07;

public class Example2 {
	public static void main(String[] args){
		//로컬 클래스를 정의하고 객체 생성
		/*
		class CImpl implements A.C{
			@Override
			public void cMethod() {
				System.out.println("CImpl-cMethod()");				
			}
		}
		CImpl cimpl = new CImpl();
		cimpl.cMethod();
		//A.C c = new CImpl();
		//c.cMethod(); // -> 이게 정석
		*/
		
		// C가 인터페이스일경우 생성자 호출이 아니라 익명객체를 생성해
		// 인터페이스로 사용하겠다는 것이다.
		// new 때문에 생성자꼴을 만들어주는 것뿐이다.
		A.C c = new A.C(){

			@Override
			public void cMethod() {
				System.out.println("CImpl-cMethod()");
			}
		};
		//c.cMethod();
	}
}
