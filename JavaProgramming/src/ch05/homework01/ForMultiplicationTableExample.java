package ch05.homework01;

public class ForMultiplicationTableExample {

	public static void main(String[] args) { // 이중 for문을 이용한 구구단 출력
		for (int m=2 ; m<=9 ; m++){
			System.out.println("***" + m + "단 ***");
			for(int n=1 ; n<=9 ; n++){
				System.out.println(m + " X " + n + " = " + (m*n));
			}
		}

	}

}
