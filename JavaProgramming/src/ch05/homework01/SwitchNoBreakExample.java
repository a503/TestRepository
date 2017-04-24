package ch05.homework01;

public class SwitchNoBreakExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8; // 8~11
		System.out.println("[현재시간 : " + time + " 시]");
		
		switch(time){ // break문이 없을경우 조건을 만족하는 문장부터 차례로 계속 출력된다.
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
	}

}
