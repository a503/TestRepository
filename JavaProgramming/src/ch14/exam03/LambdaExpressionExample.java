package ch14.exam03;

public class LambdaExpressionExample {
	public static int a = 3;

	public static void main(String[] args) {
		method1(() -> {
			a = 10; // �ʵ尪 ��� �󸶵��� ����
			System.out.println(a);
		});
		int b = 4;
		method1(() -> {
			// b = 10; // ���ú����� ���� Ŭ����(���⼭�� ���ٽ����� ������ ��ü)���� ����ϸ� final������ �ȴ�. 
			while(true){ // ���� �����尡 �����Ѵ�. ������ ���ǻ�
				System.out.println(b);
			}
		});
		
	}
	public static void method1(FunctionalInterface1 i){
		i.method();
	}
}
