package ch06.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.field2);
		Calculator.method2();
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.field1);
		calculator.method1();
		
		System.out.println(calculator.field2);
		calculator.method2();
	}

}
