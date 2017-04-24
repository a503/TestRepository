package ch05.homework01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90){ // score변수에 저장된 값이 90보다 클경우 참이므로 아래의 코드 실행
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90) // 조건이 맞이 않으므로 아래의 코드는 실행 되지 않는다.
			System.out.println("점수가 90보다 작습니다."); // if가 중괄호를 가지고 있지않으면 바로 아래 한 문장만 조건에 맞게 실행
		System.out.println("등급은 B입니다."); // 중괄호로 묶여있지 않으므로 바로위의 if와는 상관없다 그러므로 조건에 상관없이 무조건 실행
	}
}
