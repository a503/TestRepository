package ch05.homework01;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81; // 81~100
		System.out.println("���� : " + score);
		
		String grade;
		
		if(score >= 90){ //��øif��, if�� ����� �ѹ� �ɷ��� ��쿡�� �ѹ��� ������ �ɾ� �ٽ� �з�
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
		System.out.println("���� : " + grade);
	}

}
