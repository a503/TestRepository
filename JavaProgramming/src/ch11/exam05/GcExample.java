package ch11.exam05;

public class GcExample {

	public static void main(String[] args) {
		for(int i=0 ; i < 10000 ; i++){
			Member m1 = new Member(String.valueOf(i)); //valueOf에 정수값을 주면 문자열로 변경
			System.gc();
		}
		
		
		//System.gc(); // 그 즉시 실행은 아니다, JVM마음대로->출력 결과가 달라진다 지가 지운거만 출력하기 때문에.
	}

}
