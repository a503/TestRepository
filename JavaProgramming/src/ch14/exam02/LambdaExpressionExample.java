package ch14.exam02;

public class LambdaExpressionExample {

	public static void main(String[] args) {

		method1(()->
			System.out.println("run...(���ٽ�)")
		);
		method2(a-> // ���ٽĿ����� �Ű����� Ÿ���� ������ �ʴ´�. // �Ű������� �ϳ��� ��ȣ ���� // ���๮�� �ϳ��̸� �߰�ȣ ����
			System.out.println(a + "run...(���ٽ� �Ű����� �ִ�)")
		);
		method3((a, b) -> 
			System.out.println(a + b + "���ٽ� �Ű��� �� ��")
		);
		method4((a, b) -> {// return �� ����
			a = 10;// ? �Ű����� ���̳� ó�� �Ǵ°� �ƴѰ�?
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
