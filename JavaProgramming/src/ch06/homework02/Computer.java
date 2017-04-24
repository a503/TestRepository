package ch06.homework02;

public class Computer {
	//Method
	int sum1(int[] values){
		int sum = 0;
		for(int i = 0 ; i < values.length ; i ++){
			sum += values[i];
		}
		return sum;
	}
	int sum2(int ... values){ // ... -> 몇개가 들어올지 모르지만 int 값이 여러개 들어올것이다.
		int sum = 0;
		for(int i = 0 ; i < values.length ; i ++){
			sum += values[i];
		}
		return sum;
	}
}
