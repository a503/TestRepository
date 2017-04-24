package ch11.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		
		System.out.println(m1 == m2);
		// System.out.println(m1.equals(m2)); // equals 재정의 전 object의 equals사용-> 객체 비교.
		System.out.println(m1.equals(m2)); // 재정의후 이제 객체가 아닌 저장된 데이터 비교
		
		String s1 = "abc";
		String s2 = s1 + new String("def");
		
		System.out.println(s2);
				
	}

}
