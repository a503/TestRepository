package ch05.homework01;

public class SwitchNoBreakExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8; // 8~11
		System.out.println("[����ð� : " + time + " ��]");
		
		switch(time){ // break���� ������� ������ �����ϴ� ������� ���ʷ� ��� ��µȴ�.
		case 8:
			System.out.println("����մϴ�.");
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
		case 10:
			System.out.println("������ ���ϴ�.");
		default:
			System.out.println("�ܱ��� �����ϴ�.");
		}
	}

}