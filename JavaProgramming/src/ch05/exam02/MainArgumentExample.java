package ch05.exam02;

public class MainArgumentExample {

	public static void main(String[] args) {
		if(args.length == 2){
			String v1 = args[0];
			String v2 = args[1];
			
			int intV1 = Integer.parseInt(v1); // ���ڿ��� ��Ʈ������ ��ȭ�ؼ� �������ش�. ����ȭ �� �� ���� ���ڰ� ����� ����ó���ȴ�.
			int intV2 = Integer.parseInt(v2);
			//System.out.println(v1);
			//System.out.println(v2);
			System.out.println(intV1 + intV2);
		}else{
			System.out.println("�� ���� ���� �Ű����� �ʿ��մϴ�.");
		}
		
		// Ŭ������ ��ü�̸��� ch05.exam02.MainArgumentExample �̴�.
	}

}
