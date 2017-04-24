package ch11.exam03;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("blue");
		
		//System.out.println(m1.toString()); // object의 toString(), 아직 재정의 하지 않았다.
		
		System.out.println(m1.toString()); // id가 출력되도록 toString()재정의
		System.out.println(m1); // 객체의 번지를 출력하면 toString이 자동으로 호출된다.
		
		String result = m1 + " good!"; // m1의 대표 문자열을 호출해서 문자열을 더한다.
		System.out.println(result);
	}

}
