package ch11.exam09;

public class StringIndexofExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		//int location = subject.indexOf(101); // 입력한 매개값과 같은 키코드를 가지는 문자가 있을때 찾는다.
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1){
			System.out.println("자바와 관련된 책이군요");
		}else{
			System.out.println("자바와 관련없는 책이군요");
		}
	}
	// subject.contains() 메소드로 일치하는 문자열을 찾아보고 일치하는 문자열이 있으면 true, 없으면 false 반환
}
