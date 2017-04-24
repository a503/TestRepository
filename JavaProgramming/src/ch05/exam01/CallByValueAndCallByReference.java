package ch05.exam01;

public class CallByValueAndCallByReference {

	public static void main(String[] args) {
		// main메소드 안에서 다른 메소드를 사용하기위해서 부르는것을 콜이라고 한다.
		// CallByValue
		int v1 = 10;
		int v2 = 20;
		int v3 = sum(v1, v2);
		System.out.println("v1 : " + v1); // 문자열과 값을 더하면 모두 문자열로 합쳐져서 출력된다.
		System.out.println("v2 : " + v2); // +는 1. 산술연산, 2. 문자열 결합
		System.out.println("v3 : " + v3);
		// CallByReference
		int[] v4 = {10, 20};
		int v5 = sum(v4);
		
		System.out.println("v4[0] : " + v4[0]);
		System.out.println("v4[1] : " + v4[1]);
		System.out.println("v5 : " + v5);
	}
	
	public static int sum(int x, int y){
		x = 30;
		y = 40;
		return (x+y);
	}
	
	public static int sum(int[] scores){
		scores[0] = 30;
		scores[1] = 40;
		
		int sum = 0;
		for(int i = 0 ; i < scores.length ; i++){
			sum += scores[i];
		}
		return sum;
	}
}
