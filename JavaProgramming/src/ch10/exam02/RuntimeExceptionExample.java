package ch10.exam02;

import java.util.Scanner;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		// NullPointerException
		try{
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e){ // NullPointerException Ÿ���� e, ���ܰ� �߻��ϸ� JVM�� ��ü�� ����� catch�� �־��ش�
			System.out.println(e.getMessage()); // ������ ������ ���ڿ��� ����
		}finally{
			System.out.println("���������� ����ǵ��� �Ͽ����ϴ�.");
		}
		
		Scanner sc = new Scanner(System.in); // 18��
		
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
