package ch11.exam06;

public class TimeExample {

	public static void main(String[] args) {
		int sum = 0;
		
		//for���� �����ϴ� �ð��� �˰������
		//�������� �ð� �����ϰ� ������ �ð��� ���Ͽ� ���۽ð� ����
		//long startTime = System.currentTimeMillis(); // 1000���� 1�� -> ���� ���� �����ȵȴ�(10000������) (��°� ���ϱ� 0.001)
		long startTime = System.nanoTime(); // 10-9��
		for(int i = 0 ; i < 99910000 ; i ++){
			sum += i;
		}
		long endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);
		
		
	}

}
