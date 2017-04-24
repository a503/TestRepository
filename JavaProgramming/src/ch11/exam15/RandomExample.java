package ch11.exam15;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// how1
		int maxNum = 6;
		double random;
		int num = 0;
		
		
		for(int i = 0 ; i < 10 ; i++){
			random = Math.random();
			num =(int)(random*maxNum+1);
			//System.out.println(num);
		}
		Random obj = new Random();
		int num2 = obj.nextInt()+1;
		System.out.println(num2);
	}

}
