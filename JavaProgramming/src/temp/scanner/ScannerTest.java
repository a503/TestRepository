package temp.scanner;

import java.util.Scanner;

public class ScannerTest {
	/*
	 * 스캐너 간단한 테스트용, nextLine() 메소드의 구분자는 엔터키(/r/n)?;
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String testStr = sc.nextLine();
		
		System.out.println(testStr);
	}

}
