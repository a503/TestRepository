package ch05.homework01;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1 ; i<=10 ; i++){
			if(i%2 != 0){ // 2�� ���� �������� 0�� �ƴ� ��� -> Ȧ��
				continue; // �ݺ����� �����Ű�� �ʰ� �� ������ ������ ���������ʰ� ���� �ݺ����� �Ѿ��(Ȧ���� ��� ��¹��� ������� �ʴ´�)
			}
			System.out.println(i);
		}

	}

}
