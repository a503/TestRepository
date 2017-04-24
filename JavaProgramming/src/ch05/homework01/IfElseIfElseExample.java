package ch05.homework01;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		//ifelse문에서 상위의 조건이 맞으면 하위 코드들은 접근하지않는다.
		/*
		if(score > 100){
			System.out.println("점수가 잘 못 입력 되었습니다.");
		}else*/ if (score >= 90){
			System.out.println("점수가 100~90 입니다."); // 실제로는 100점의 한계가 없다 그러므로 90점이상이면 모두 이조건에 맞게 된다.
			System.out.println("등급은 A 입니다.");
		}else if (score >= 80){
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		}else if (score >= 70){
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		}else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}/*else if(score < 70 && score >= 0){
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}else{
			System.out.println("점수가 잘 못 입력 되었습니다.");
		}*/

	}

}
