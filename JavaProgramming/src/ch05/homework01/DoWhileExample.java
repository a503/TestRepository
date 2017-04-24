package ch05.homework01;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in); 
		// Scanner 객체 생성, read()메소드는 키 코드만 읽기 때문에 콘솔에 입력된 문자열을 한 번에 읽을 수 없다.
		// 그래서 Scanner객체를 생성하고 nextLine() 메소드로 입력한 문자열을 한 번에 읽는다.
		// 반환형이 문자열이므로 String 변수에 반환값을 저장한다.
		String inputString; // 입력한 문자열을 받을 변수선언/
		do{
			System.out.print(">");
			inputString = scanner.nextLine(); // 키보드로 입력한 문자열 한 줄을 얻음
			System.out.println(inputString);
		}while(!inputString.equals("q")); //키보드에 입력한 문자열과 q를 비교해서 같으면 true, 다르면 false 반환, !연산자로 인하여 문자열이 다를경우 조건이 true가 되서 계속 반복
		
		System.out.println(); //개행
		System.out.println("프로그램 종료");
		
													

	}

}
