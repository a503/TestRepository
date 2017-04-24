package ch14.exam09;

import java.util.function.IntBinaryOperator;

public class LambdaExpressionExample {
	//field
	private static int[] scores = {87, 92, 95, 100, 300, 12};
	
	public static void main(String[] args) {
		int max = maxOrMin((a, b) -> {
			if(a>b){
				return a;
			}else
				return b;
		});
		int min = maxOrMin((a, b)->{
			if(a<b){
				return a;
			}else{
				return b;
			}
		});
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	public static int maxOrMin(IntBinaryOperator operator){
		int result = scores[0];
		for(int score : scores){
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
}
