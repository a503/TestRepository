package ch05.exam02;

public class ArrayExample01 {
	public static void main(String[] args){
		int[] v1 = {80, 90, 87};
		int[] v2 = {80, 90, 87, 70};
		String[] v3 = {"Java", "Program"};
		
		System.out.println(v1 == v2); // �׸��� ������ �ٸ� �迭.
		System.out.println(v1[0] == v2[0]);
		
		System.out.println(v1.length);
		System.out.println(v1.toString()+" �ؽ��ڵ�");// �迭�� toString
		System.out.println(v2.length);
		System.out.println(v3.length);
		System.out.println(args.length); // �׸��� ���� ����ִ� ��ü�� ���´�.
		
		int v4 = v1[0] + v1[1] + v1[2];
		System.out.println("v4 : " + v4);
		int v5 = 0;
		for(int i = 0 ; i < v1.length ; i++){ // for(���� ���� ; ���� ; �ݺ��Ҷ����� 1�� ����) // �迭�� �׸��� ������ ��Ȯ�� �𸦶� length�ʵ带 �̿��� ������.
			// for�� 4��
			v5 += v1[i];
		}
		System.out.println("v5 : " + v5);
	}

}
