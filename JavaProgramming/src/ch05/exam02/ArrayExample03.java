package ch05.exam02;

public class ArrayExample03 {
	public static void main(String[] args){
		int[] v1 = new int[5]; // ���� ����ִ� ũ��5�� �迭�� ���� ���� v1�� ����, �ʱⰪ�� ��� 0���� �����Ѵ�.
		v1[0] = 10;
		v1[2] = 10;
		
		String[] v2 = new String[5];
		v2[0] = new String("Java");
		v2[2] = new String("Java");
		
		String[] v3 = new String[5];
		v3[0] = "Java";
		v3[2] = "Java";
		
		System.out.println(v1[0] == v1[2]);
		System.out.println(v2[0] == v2[2]);
		System.out.println(v2[0].equals(v2[2]));
		
		System.out.println(v3[0] == v3[2]);
		
		//double[] v2 = new double[5];
		//boolean[] v3 = new boolean[5];
		//String[] v4 = new String[5];
		// �ʱⰪ�� 0�� �ǹ̸� ������ ������ �ʱ�ȭ �ȴ�.
		// String n = 0; ���ڿ��� �ƴϹǷ� ���� �߻�
		
		//for(int i = 0 ; i < v1.length ; i++){
		//	System.out.println("v1["+i+"] : " + v1[i]);
		//}
		//for(int i = 0 ; i < v2.length ; i++){
		//	System.out.println("v2["+i+"] : " + v2[i]);
		//}
		//for(int i = 0 ; i < v3.length ; i++){
		//	System.out.println("v3["+i+"] : " + v3[i]);
		//}
		//for(int i = 0 ; i < v4.length ; i++){
		//	System.out.println("v4["+i+"] : " + v4[i]);
		//}
		 
	}
}
