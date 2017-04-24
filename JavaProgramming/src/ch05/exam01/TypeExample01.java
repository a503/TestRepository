package ch05.exam01; // package name

public class TypeExample01 { // source file name, 시작
	public static void main(String[] args){
		System.out.println("main() method run...");
		// 기본타입
		//정수
		byte v1 = 10; // -128~127
		//byte v1 = 200; // error
		char v2 = 'A'; // 문자가 저장이 될때는 문자에 일치하는 유니코다 값이 저장
		short v3 = 10;
		int v4 = 10;
		//int v4 = 10L; // error발생 우측의 값이 좌측의 저장공간보다 크다.
		long v5 = 10L; // 컴파일러에게 미리 알려준다.
		//실수(기본적으로 자바는 실수를 8바이트로 표시)
		float v6 = 10.0f; //4바이트 실수라고 표시한다.
		double v7 = 10.0; 
		//true or false
		boolean v8 = true;
		
		// 참조타입
		String name = "JAVA";
		int[] scores = {90, 80, 85}; // 배열의 항목타입이 int, 기본타입 아님
	}
}//끝
