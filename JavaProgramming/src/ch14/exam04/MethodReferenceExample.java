package ch14.exam04;

public class MethodReferenceExample {
	public static void main(String[] args) {
		
		
		// �ϳ��� ���๮�� �޼ҵ� ȣ�⸸ ������
		// �ݷеΰ� �޼ҵ� ����->�޼ҵ带 ȣ���ϴ� ��, �Ű����� ����̴� ���� �޼ҵ带 �����ؼ� �����Ϸ��� �Ű��� ����
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
		method1(Math :: min); // �ּҰ��� �����Ѵ�.
		method1(new FunctionalInterface1() {
			@Override
			public int method(int a, int b) {
				return Math.min(a, b);
			}
		});
		
		// ���� ���� Ŭ������ ���
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
	public static void method1(FunctionalInterface1 i){ // ���⿡ �־��ִ� ���� ���� ������ ����
		int result = i.method(3, 5);
		System.out.println("�� : " + result);
	}
}
