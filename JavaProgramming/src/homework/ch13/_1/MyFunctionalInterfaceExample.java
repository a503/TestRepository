package homework.ch13._1;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		// �Ű������� ���ϰ��� ���� ���
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
