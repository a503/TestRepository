package ch11.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		
		System.out.println(m1 == m2);
		// System.out.println(m1.equals(m2)); // equals ������ �� object�� equals���-> ��ü ��.
		System.out.println(m1.equals(m2)); // �������� ���� ��ü�� �ƴ� ����� ������ ��
		
		String s1 = "abc";
		String s2 = s1 + new String("def");
		
		System.out.println(s2);
				
	}

}
