package ch05.exam01;

public class CompareValueExample {

	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 10;
		System.out.println("v1 == v2 ? " + (v1 == v2));
		
		int[] v3 = {10};
		//int[] v4 = {10}; // false
		int[] v4 = v3; // true
		System.out.println("v3 == v4 ? " + (v3 == v4));
		
		//String v5 = "Java";
		//String v6 = "Java"; // ���ڿ��� ���ͷ��� ���ٸ� �ϳ��� ��ü�� �����Ѵ�, String�� ����, String�� ������ ��κ��� new�� �̿��� ��ü�� �����Ѵ�.
		//String v6 = v5;
		
		String v5 = "Java"; // ���ͷ��� �ٸ��� ������ ���ϸ� �ٸ� ��ü.
		//String v6 = "java";
		
		//String v5 = new String("Java"); // new ���Ӱ� ������, ��ü�� �������� �ʰ� ���ο� ��ü�� �����Ѵ�.
		String v6 = new String("Java");
		
		System.out.println("v5 == v6 ? " + (v5 == v6));
		System.out.println("v5, v6 ���ڿ� �� ? " + (v5.equals(v6))); // ���� �ٸ� �� ��ü�� ���ڿ��� ���ϰ� ������ ���.

	}

}
