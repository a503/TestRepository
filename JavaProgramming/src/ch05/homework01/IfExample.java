package ch05.homework01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90){ // score������ ����� ���� 90���� Ŭ��� ���̹Ƿ� �Ʒ��� �ڵ� ����
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		if(score < 90) // ������ ���� �����Ƿ� �Ʒ��� �ڵ�� ���� ���� �ʴ´�.
			System.out.println("������ 90���� �۽��ϴ�."); // if�� �߰�ȣ�� ������ ���������� �ٷ� �Ʒ� �� ���常 ���ǿ� �°� ����
		System.out.println("����� B�Դϴ�."); // �߰�ȣ�� �������� �����Ƿ� �ٷ����� if�ʹ� ������� �׷��Ƿ� ���ǿ� ������� ������ ����
	}
}
