package homework.ch13._5;

public class UsingLocalVariable {
	void method(int arg){
		int localVar = 40;
		
		//arg = 31; final Ư���� �ٰԵȴ�
		//localVar = 41; final Ư���� �ٰԵȴ�, ����Ŭ����(���ٽ�)���� ����ϰ� �Ǹ鼭
		
		MyFunctionalInterface i = () ->{
			System.out.println("arg> " + arg);
			System.out.println("localVar> " + localVar);
		};
		i.method();
	}
}
