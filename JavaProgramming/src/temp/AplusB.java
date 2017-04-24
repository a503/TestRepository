package temp;

import java.util.Scanner;

public class AplusB {
	public static void main(String[] args){
		int a = 0;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if((a > 0 && a < 10) && (b > 0 && b < 10)){
			System.out.println(a+b);
		}else{
			System.out.println("숫자 입력이 잘못 되었습니다. (0 < Num < 10");
		}
	}
}
