package ch11.exam03;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("blue");
		
		//System.out.println(m1.toString()); // object�� toString(), ���� ������ ���� �ʾҴ�.
		
		System.out.println(m1.toString()); // id�� ��µǵ��� toString()������
		System.out.println(m1); // ��ü�� ������ ����ϸ� toString�� �ڵ����� ȣ��ȴ�.
		
		String result = m1 + " good!"; // m1�� ��ǥ ���ڿ��� ȣ���ؼ� ���ڿ��� ���Ѵ�.
		System.out.println(result);
	}

}
