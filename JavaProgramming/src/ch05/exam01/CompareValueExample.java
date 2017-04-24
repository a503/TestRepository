package ch05.exam01;

public class CompareValueExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 10;
		System.out.println("v1 == v2 ? " + (v1 == v2));
		
		int[] v3 = {10};
		//int[] v4 = {10}; // false
		int[] v4 = v3; // true
		System.out.println("v3 == v4 ? " + (v3 == v4));
		
		//String v5 = "Java";
		//String v6 = "Java"; // 문자열의 리터럴이 같다면 하나의 객체를 공유한다, String만 예외, String을 제외한 대부분은 new를 이용해 객체를 생성한다.
		//String v6 = v5;
		
		String v5 = "Java"; // 리터럴이 다르기 때문에 비교하면 다른 객체.
		//String v6 = "java";
		
		//String v5 = new String("Java"); // new 새롭게 만들어라, 객체를 공유하지 않고 새로운 객체를 생성한다.
		String v6 = new String("Java");
		
		System.out.println("v5 == v6 ? " + (v5 == v6));
		System.out.println("v5, v6 문자열 비교 ? " + (v5.equals(v6))); // 서로 다른 두 객체의 문자열만 비교하고 싶을때 사용.

	}

}
