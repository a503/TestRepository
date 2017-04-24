package homework.ch13._5;

public class UsingLocalVariable {
	void method(int arg){
		int localVar = 40;
		
		//arg = 31; final 특성이 붙게된다
		//localVar = 41; final 특성이 붙게된다, 로컬클래스(람다식)에서 사용하게 되면서
		
		MyFunctionalInterface i = () ->{
			System.out.println("arg> " + arg);
			System.out.println("localVar> " + localVar);
		};
		i.method();
	}
}
