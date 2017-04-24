package ch05.homework01;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10){ // 조건이 참일때까지 반복
			System.out.println(i);
			i++; // 조건에 들어갈 값을 변화시키는 이 라인이없으면 무한 루프에 빠진다.
		}

	}

}
