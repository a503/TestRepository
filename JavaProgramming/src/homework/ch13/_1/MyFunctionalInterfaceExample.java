package homework.ch13._1;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		// 매개변수와 리턴값이 없는 경우
		MyFunctionalInterface i;
		
		i = () ->{
			String str = "method call1";
			System.out.println(str);
		};
		i.method();
		
		i = () -> {
			System.out.println("method call2");
		};
		i.method();
		
		i = () -> System.out.println("method call3");
		i.method();
		
	}
}
