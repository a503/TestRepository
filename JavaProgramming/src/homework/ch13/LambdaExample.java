package homework.ch13;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method(int x, int y){
		IntSupplier supplier = () -> {
			// x *= 10; // error 발생 지점, final선언이된 매개변수의 값을 바꾸려 했기 때문에
			int result = x + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}
}
