package ch05.homework01;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in); 
		// Scanner ��ü ����, read()�޼ҵ�� Ű �ڵ常 �б� ������ �ֿܼ� �Էµ� ���ڿ��� �� ���� ���� �� ����.
		// �׷��� Scanner��ü�� �����ϰ� nextLine() �޼ҵ�� �Է��� ���ڿ��� �� ���� �д´�.
		// ��ȯ���� ���ڿ��̹Ƿ� String ������ ��ȯ���� �����Ѵ�.
		String inputString; // �Է��� ���ڿ��� ���� ��������/
		do{
			System.out.print(">");
			inputString = scanner.nextLine(); // Ű����� �Է��� ���ڿ� �� ���� ����
			System.out.println(inputString);
		}while(!inputString.equals("q")); //Ű���忡 �Է��� ���ڿ��� q�� ���ؼ� ������ true, �ٸ��� false ��ȯ, !�����ڷ� ���Ͽ� ���ڿ��� �ٸ���� ������ true�� �Ǽ� ��� �ݺ�
		
		System.out.println(); //����
		System.out.println("���α׷� ����");
		
													

	}

}
