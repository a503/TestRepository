package ch10.exam04;

public class ThrowsExample {

	public static void main(String[] args) {
		try{
			Class.forName(" ");
			System.in.read();
		}catch(Exception e){
			//���� ó�� �ڵ�
			System.out.println("�˼� ���� ���� �߻�");
		}
		try{
			devide(10, 0);
		}catch(ArithmeticException e){
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
	}
	static void devide(int x, int y) throws ArithmeticException{
		int result = x / y; // ArithmeticException
	}

}
