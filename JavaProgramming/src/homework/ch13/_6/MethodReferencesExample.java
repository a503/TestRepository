package homework.ch13._6;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		// 메소드 참조
		IntBinaryOperator operator; // 함수적 인터페이스 int타입 두개를 매개값으로 받는 추상메소드가 있다.
		
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1 : " + operator.applyAsInt(1, 2));
		
		operator = Calculator::staticMethod;
		System.out.println("결과2 : " + operator.applyAsInt(3, 4));
		
		// 인스턴스 메소드에 접근하기 위해 클래스를 생성했다
		Calculator obj = new Calculator();
		operator = (x, y)-> obj.instanceMethod(x, y);
		System.out.println("결과3 : " + operator.applyAsInt(5, 6));
		
		operator = obj :: instanceMethod;
		System.out.println("결과4 : " + operator.applyAsInt(7, 8));
	}
}
