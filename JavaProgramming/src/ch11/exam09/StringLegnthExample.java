package ch11.exam09;

public class StringLegnthExample {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		
		if(ssn.length() == 13){
			System.out.println("주민번호 자리수가 맞습니다.");
		}else{
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}

}
