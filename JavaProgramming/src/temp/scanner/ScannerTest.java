package temp.scanner;

import java.util.Scanner;

public class ScannerTest {
	/*
	 * ��ĳ�� ������ �׽�Ʈ��, nextLine() �޼ҵ��� �����ڴ� ����Ű(/r/n)?;
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String testStr = sc.nextLine();
		
		System.out.println(testStr);
	}

}
