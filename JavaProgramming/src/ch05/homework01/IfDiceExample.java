package ch05.homework01;

public class IfDiceExample {
	// 0.0 <= Math.random() <1.0 ���� Ÿ���� ���� ����, ������ �������� ���� ���� ����, (int)�� ���������� ����ȯ
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; // �ֻ��� ����(1~6)
		//System.out.println("������ Ȯ�� : " + num);
		if(num == 1){
			System.out.println("1���� ���Խ��ϴ�.");
		}else if(num == 2){
			System.out.println("2���� ���Խ��ϴ�.");
		}else if(num == 3){
			System.out.println("3���� ���Խ��ϴ�.");
		}else if(num == 4){
			System.out.println("4���� ���Խ��ϴ�.");
		}else if(num == 5){
			System.out.println("5���� ���Խ��ϴ�.");
		}else{
			System.out.println("6���� ���Խ��ϴ�.");
		}
	}

}