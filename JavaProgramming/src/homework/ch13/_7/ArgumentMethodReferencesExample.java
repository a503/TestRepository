package homework.ch13._7;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function; // 두 String 매개값을 받고 int 값을 리턴한다 // 함수적 인터페이스
		
		function = (a, b) -> a.compareToIgnoreCase(b); // 대소문자에 관계없이 두문자열 비교// 사전순으로 a가 b보다 먼저오면 음수, 같으면 0, 나중에오면 양수
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}

	private static void print(int applyAsInt) {
		if(applyAsInt < 0){
			System.out.println("사전순으로 먼저 옵니다.");
		}else if(applyAsInt == 0){
			System.out.println("동일한 문자열 입니다.");
		}else{
			System.out.println("사전순으로 나중에 옵니다");
		}
	}
	

}
