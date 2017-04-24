 package ch05.homework01;

public class BreakExample {

	public static void main(String[] args) {
		while(true){
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6){
				break; // break문은 가장 가까운 반복문 하나만 종료시킨다.
			}
		}
		System.out.println("프로그램 종료");
	}

}
