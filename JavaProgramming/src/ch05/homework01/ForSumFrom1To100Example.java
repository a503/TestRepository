package ch05.homework01;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0; // 총합 변수
		
		//int i = 0; //카운터 변수 for문 밖에서 선언한 경우 외부에서도 사용 가능
		//for(i=1 ; i<=100 ; i++){
		for(int i=1 ; i<=100 ; i++){
			sum += i; // sum = sum + i;
		}
		System.out.println("1~100의 총합 : " + sum);
		//System.out.println(i); //i가 100일때 반복문이 한번더 실행하므로 반복문이 끝난후 i의 갑은 101.
		//System.out.println("1~" + (i-1) +" 합 : " + sum);
	}

}
