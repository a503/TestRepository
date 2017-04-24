package ch14.exam02;

public class LambdaExpressionExample {

	public static void main(String[] args) {

		method1(()->
			System.out.println("run...(람다식)")
		);
		method2(a-> // 람다식에서는 매개값의 타입을 전하지 않는다. // 매개변수가 하나면 괄호 생략 // 실행문이 하나이면 중괄호 생략
			System.out.println(a + "run...(람다식 매개값이 있는)")
		);
		method3((a, b) -> 
			System.out.println(a + b + "람다식 매개값 두 개")
		);
		method4((a, b) -> {// return 도 생략
			a = 10;// ? 매개값도 파이널 처리 되는거 아닌가?
			return a + b;
		});
	}
	public static void method1(FunctionalInterface1 i){
		i.method();
	}
	public static void method2(FunctionalInterface2 i){
		i.method(3);
	}
	public static void method3(FunctionalInterface3 i){
		i.method(3, 5);
	}
	public static void method4(FunctionalInterface4 i){
		int result = i.method(3, 5);
		System.out.println("result : " + result);
	}
	
}
