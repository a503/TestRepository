package ch05.homework01;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1 ; i<=10 ; i++){
			if(i%2 != 0){ // 2로 나눈 나머지가 0이 아닐 경우 -> 홀수
				continue; // 반복문을 종료시키지 않고 그 이후의 문장을 실행하지않고 다음 반복으로 넘어간다(홀수일 경우 출력문이 실행되지 않는다)
			}
			System.out.println(i);
		}

	}

}
