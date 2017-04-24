package ch14.exam03;

public class LambdaExpressionExample {
	public static int a = 3;

	public static void main(String[] args) {
		method1(() -> {
			a = 10; // 필드값 사용 얼마든지 가능
			System.out.println(a);
		});
		int b = 4;
		method1(() -> {
			// b = 10; // 로컬변수를 로컬 클래스(여기서는 람다식으로 구현된 객체)에서 사용하면 final선언이 된다. 
			while(true){ // 원래 스레드가 들어가야한다. 하지만 편의상
				System.out.println(b);
			}
		});
		
	}
	public static void method1(FunctionalInterface1 i){
		i.method();
	}
}
