package ch05.homework01;

public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90){
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}else{ // if의 조건에 맞이 않을 경우에 실행된다 = score < 90
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

	}

}
