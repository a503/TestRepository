package ch05.homework01;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade){
		case 'A': // break�� ������ ��츦 �����Ͽ� �ΰ��� ���(��ҹ���)�� ��� �����Ҽ� �ְ� �Ѵ�
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;	
		default:
			System.out.println("�մ��Դϴ�.");	
		}

	}

}
