package ch05.homework01;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81; // 81~100
		System.out.println("점수 : " + score);
		
		String grade;
		
		if(score >= 90){ //중첩if문, if를 사용해 한번 걸러내 경우에서 한번더 조건을 걸어 다시 분류
			if(score >= 95)
				grade = "A+";
			else
				grade = "A";
		}else{ // score < 90
			if(score >= 85)
				grade = "B+";
			else
				grade = "B ";
		}
		System.out.println("학점 : " + grade);
	}

}
