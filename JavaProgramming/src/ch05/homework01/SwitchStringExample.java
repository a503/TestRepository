package ch05.homework01;

public class SwitchStringExample {

	public static void main(String[] args) {
		// 자바 6 까지는 switch문의 괄호에는 정수타입 또는 정수를 산출하는 연산식만 올 수 있었지만
		// 자바 7 부터 String타입의 변수도 올 수 있다.
		String position = "과장";
		
		switch(position){
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}

	}

}
