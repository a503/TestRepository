package ch05.homework01;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception{
		boolean run = true; // while���� ���ѹݺ���Ű������ ����
		int speed = 0; // ���� �ӵ�
		int keyCode = 0; //Ű���忡�� �޴� Ű �ڵ�
		
		while(run){ // run�� ���� false�� �Ǳ� ������ ��� �ݺ��Ѵ�.
			if(keyCode != 13 && keyCode != 10){ // ����Ű�� �ִ� ĳ��������(13), �����ǵ�(10)�� �Էµɰ�� �������� �ʱ� ���ؼ� ���� ��
				System.out.println("-----------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("-----------------------------");
				System.out.print("���� : "); // println�� �ٸ��� �������� �ʰ� Ŀ�� ����
			}
			keyCode = System.in.read(); // Ű������ �Է°�(int��)�� ��ȯ, throws Exception�� ���߿� ����
			
			if(keyCode == 49){ // �Է� 1.
				speed++; //�ӵ� ����
				System.out.println("���� �ӵ� = " + speed);
			}else if(keyCode == 50){ // �Է� 2
				speed--; //�ӵ� ����
				System.out.println("���� �ӵ� = " + speed);
			}else if(keyCode == 51){ // �Է� 3
				run = false; //���ǹ��� �������� �ٲپ� while���� ����
				// retrun; main�޼ҵ带 ������� jvm ����
				// System.exit(0); ������ jvm ����
			}
		}
		System.out.println("���α׷� ����");
	}

}
