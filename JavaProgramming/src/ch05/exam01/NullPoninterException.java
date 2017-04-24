package ch05.exam01;

public class NullPoninterException {

	public static void main(String[] args) {
		/*
		int[] scores =  null;
		
		System.out.println(scores[0]); // compile error not found, 실행할때 예외 발생(NullPointerException)
		// 패키지.클래스명.메소드(에러발생 라인)<-에러코드
		// 어떤 참조변수가 null이라는 값을 가지고 있을때 아무런 객체를 참조하지 않으므로 그 객체로 가서 데이터를 요구할때 발생
		*/
		String name = null;
		System.out.println(name.length()); // 참조변수. <- 객체 접근 연산자, 그 객체가 가지고 있는 length라는 메소드를 실행하라.
		System.out.println(name.toString()); // name이 참조하는 객체가 없으므로 NullPointerException 발생 ,**가장 많이 발생하는 예외중 하나.
		
	}

}
