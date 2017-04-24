package ch05.exam02;

public class ArrayExample01 {
	public static void main(String[] args){
		int[] v1 = {80, 90, 87};
		int[] v2 = {80, 90, 87, 70};
		String[] v3 = {"Java", "Program"};
		
		System.out.println(v1 == v2); // 항목이 같을뿐 다른 배열.
		System.out.println(v1[0] == v2[0]);
		
		System.out.println(v1.length);
		System.out.println(v1.toString()+" 해쉬코드");// 배열의 toString
		System.out.println(v2.length);
		System.out.println(v3.length);
		System.out.println(args.length); // 항목이 없는 비어있는 객체가 들어온다.
		
		int v4 = v1[0] + v1[1] + v1[2];
		System.out.println("v4 : " + v4);
		int v5 = 0;
		for(int i = 0 ; i < v1.length ; i++){ // for(변수 선언 ; 조건 ; 반복할때마다 1씩 증가) // 배열의 항목의 갯수를 정확히 모를때 length필드를 이용해 돌린다.
			// for문 4장
			v5 += v1[i];
		}
		System.out.println("v5 : " + v5);
	}

}
