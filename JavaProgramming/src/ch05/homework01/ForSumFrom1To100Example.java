package ch05.homework01;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0; // ���� ����
		
		//int i = 0; //ī���� ���� for�� �ۿ��� ������ ��� �ܺο����� ��� ����
		//for(i=1 ; i<=100 ; i++){
		for(int i=1 ; i<=100 ; i++){
			sum += i; // sum = sum + i;
		}
		System.out.println("1~100�� ���� : " + sum);
		//System.out.println(i); //i�� 100�϶� �ݺ����� �ѹ��� �����ϹǷ� �ݺ����� ������ i�� ���� 101.
		//System.out.println("1~" + (i-1) +" �� : " + sum);
	}

}
