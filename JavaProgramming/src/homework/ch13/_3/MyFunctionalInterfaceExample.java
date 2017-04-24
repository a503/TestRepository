package homework.ch13._3;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		// 리턴값이 있는 람다
		MyFunctionalInterface i;
		
		i = (x, y) ->{
			int result = x + y;
			return result;
		};
		System.out.println(i.method(2, 5));
		
		i = (x, y) -> {
			return x + y;
		};
		System.out.println(i.method(2, 5));
		
		i = (x, y) -> x + y;
		System.out.println(i.method(2, 5));
		
		i = (x, y) -> sum(x, y);
		System.out.println(i.method(2, 5));
	}
	public static int sum(int x, int y){
		return x + y;
	}
}
