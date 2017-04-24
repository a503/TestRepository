package ch11.exam14;

public class WrapperEqualsExample {

	public static void main(String[] args) {
		Integer v1 =1000;
		Integer v2 =1000;
		System.out.println(v1 == v2);
		System.out.println(v1.intValue() == v2.intValue());
		System.out.println(v1.equals(v2)); //기본타입 값 비교는 항상 .toEquals()로 비교해라
	}

}
