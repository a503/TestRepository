package ch05.exam02;

public class ArrayExample02 {
	public static void main(String[] args){
		int[] v1 = {10, 20, 30};
		
		//int[] v2;
		//v2 = {10, 20, 30}; // complier�� �迭�� �����Ҷ� �迭�� ���̸� �����ϴµ�, �̷� ��� �����Ϸ��� �迭�� ���̸� �� �� ����.
		// �������� �޾Ƶ�����. 
		
		int[] v2;
		v2 = new int[] {10, 20, 30}; // ���ο� �迭��ü�� ����� �׸��� �ش�.
		
		// v1 �迭�� ������ sum �޼ҵ�� ����
		int result1 = sum(v1);
		// v2 �迭�� ������ sum �޼ҵ�� ����
		int result2 = sum(v2);
		
		//sum({10, 20, 30}); // sum �޼ҵ忡 ������ ����Ǿ������Ƿ� ���߿� ����� �����Ҷ��� new �� �ʿ��ϴ�.
		int result3 = sum(new int[] {10, 20, 30});
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	public static int sum(int[] args){
		int sum = 0;
		//int sum; �ʱ�ȭ ���� �����Ƿ� ���� ������ �������� �ʾҴ�. �׷��Ƿ� ������ �߻�(������� ���� ������ ���� �����ҷ��� �ϹǷ�)
		for(int i=0 ; i<args.length ; i++){
			sum += args[i];
			// sum = sum + args[i]; ���� ��, �ӵ� ���̴� �����Ϸ����� ���̰� �ִ�.
		}
		return sum;
	}
}
