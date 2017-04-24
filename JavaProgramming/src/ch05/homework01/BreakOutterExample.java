package ch05.homework01;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter:for(char upper='A' ; upper<='Z' ; upper++){
				for(char lower='a' ; lower<='z' ; lower++){
					System.out.println(upper + "-" + lower);
					
					if(lower == 'g'){ // lower가 'g'일경우 Outter가 붙은 반복문을 종료 시킨다
						break Outter;
					}
				}
		}
	}

}
