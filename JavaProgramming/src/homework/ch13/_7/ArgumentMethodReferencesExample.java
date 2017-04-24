package homework.ch13._7;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function; // �� String �Ű����� �ް� int ���� �����Ѵ� // �Լ��� �������̽�
		
		function = (a, b) -> a.compareToIgnoreCase(b); // ��ҹ��ڿ� ������� �ι��ڿ� ��// ���������� a�� b���� �������� ����, ������ 0, ���߿����� ���
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}

	private static void print(int applyAsInt) {
		if(applyAsInt < 0){
			System.out.println("���������� ���� �ɴϴ�.");
		}else if(applyAsInt == 0){
			System.out.println("������ ���ڿ� �Դϴ�.");
		}else{
			System.out.println("���������� ���߿� �ɴϴ�");
		}
	}
	

}
