package ch10.exam02;

import java.util.Scanner;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		// NullPointerException
		try{
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e){ // NullPointerException 타입의 e, 예외가 발생하면 JVM이 객체를 만들어 catch에 넣어준다
			System.out.println(e.getMessage()); // 에러의 원인을 문자열로 리턴
		}finally{
			System.out.println("정상적으로 실행되도록 하였습니다.");
		}
		
		Scanner sc = new Scanner(System.in); // 18장
		
		while(true){
			System.out.print("Input> ");
			String strNum = sc.nextLine();
			try{
				int num = Integer.parseInt(strNum);
			
				System.out.println("Output> " + num);
			}catch(NumberFormatException e){
				System.out.println("Please Input Only Number");
			}
		}

	}

}
