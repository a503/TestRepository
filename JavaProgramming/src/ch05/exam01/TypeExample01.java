package ch05.exam01; // package name

public class TypeExample01 { // source file name, ����
	public static void main(String[] args){
		System.out.println("main() method run...");
		// �⺻Ÿ��
		//����
		byte v1 = 10; // -128~127
		//byte v1 = 200; // error
		char v2 = 'A'; // ���ڰ� ������ �ɶ��� ���ڿ� ��ġ�ϴ� �����ڴ� ���� ����
		short v3 = 10;
		int v4 = 10;
		//int v4 = 10L; // error�߻� ������ ���� ������ ����������� ũ��.
		long v5 = 10L; // �����Ϸ����� �̸� �˷��ش�.
		//�Ǽ�(�⺻������ �ڹٴ� �Ǽ��� 8����Ʈ�� ǥ��)
		float v6 = 10.0f; //4����Ʈ �Ǽ���� ǥ���Ѵ�.
		double v7 = 10.0; 
		//true or false
		boolean v8 = true;
		
		// ����Ÿ��
		String name = "JAVA";
		int[] scores = {90, 80, 85}; // �迭�� �׸�Ÿ���� int, �⺻Ÿ�� �ƴ�
	}
}//��
