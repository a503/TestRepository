package homework.ch13._2;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		// 매개변수를 사용한 람다식
		MyFunctionalInterface i;
		
		i = (x) ->{
			int result = x * 5;
			System.out.println(result);
		};
		i.method(2);
		
		i = (x) -> {
			System.out.println(x * 5);
		};
		i.method(2);
		
		i = x -> System.out.println(x * 5);
		i.method(2);
		
	}
}
