package ch05.homework01;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f ; x<=1.0f ; x+=0.1f){ // 이론상 10번 반복해야한다 하지만 float타입은 0.1을 정확하게 표현할수 없기 때문에 반복때마다 0.1보다 약간 큰값이 더해진다.
												// 그러므로 루프는 9번만 반복된다. 초기화식에 실수 타입을 사용하지 말자.
			System.out.println(x);
		}

	}

}
