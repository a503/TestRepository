package ch06.homework03;

public class SingletonExample {

	public static void main(String[] args) {
		// Singleton obj1 = new Singleton(); �����ڰ� private������ �Ǿ��ֱ� ������ �ܺο��� �����ڸ� ȣ���Ҽ������Ƿ� ������ ���� �߻�
		
		Singleton obj1 = Singleton.getInstance(); // Ŭ�������� �̿��Ͽ� �����޼ҵ忡 �����ߴ�. �� �޼ҵ�� �ش� Ŭ�������� ������ ��ü�� �ּҰ��� ��ȯ �ϹǷ�
													// Ŭ���� �������� obj1���� �ش� ��ü�� �ּҰ��� ���´�.
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2){ // ���� ��ü�� �ּҰ��� ������ �ִ� ����
			System.out.println("���� Singleton ��ü �Դϴ�.");
			//System.out.println(obj1);
			//System.out.println(obj1.toString());
		}else{
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
	}

}
