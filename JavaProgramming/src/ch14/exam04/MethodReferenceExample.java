package ch14.exam04;

public class MethodReferenceExample {
	public static void main(String[] args) {
		
		
		// 하나의 실행문과 메소드 호출만 있을때
		// 콜론두개 메소드 참조->메소드를 호출하는 것, 매개값이 없어보이는 형태 메소드를 참고해서 컴파일러가 매개값 결정
		// max
		method1((a, b)->{
			return Math.max(a, b);
		});
		method1((a, b)-> Math.max(a, b));
		method1(Math :: max);
		method1(new FunctionalInterface1() {
			@Override
			public int method(int a, int b) {
				return Math.max(a, b);
			}
		});
		//min
		method1((a, b)-> {
			return Math.min(a, b);
		});
		method1((a, b)-> Math.min(a, b));
		method1(Math :: min); // 최소값을 리턴한다.
		method1(new FunctionalInterface1() {
			@Override
			public int method(int a, int b) {
				return Math.min(a, b);
			}
		});
		
		// 내가 만든 클래스로 사용
		//staticSum
		method1((a, b)->{
			return Calculator.staticSum(a, b);
		});
		method1((a, b)-> Calculator.staticSum(a, b));
		method1(Calculator :: staticSum);
		//staticMulti
		method1((a, b)->{
			return Calculator.staticMulti(a, b);
		});
		method1((a, b)-> Calculator.staticMulti(a, b));
		method1(Calculator :: staticMulti);
		
		// minus
		Calculator calc = new Calculator();
		method1((a, b)->{
			return calc.minus(a, b);
		});
		method1((a, b)-> calc.minus(a, b));
		method1(calc :: minus);
		
		
	}
	public static void method1(FunctionalInterface1 i){ // 여기에 넣어주는 값에 따라 다형성 구현
		int result = i.method(3, 5);
		System.out.println("값 : " + result);
	}
}
