package homework.ch13._8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member::new; // 내부는 모르겠고 String매개값을 받아 Member객체 생성
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member::new; // 내부는 모르겠고 두 개의 String 매개값을 받아 Member객체 생성
		Member member2 = function2.apply("천사", "angel");
		// 생성자 참조 방법은 같지만, 매개값을 달리해 다른 결과 도출
	}

}
