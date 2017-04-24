package ch05.homework01;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade){
		case 'A': // break가 없을때 경우를 응용하여 두가지 경우(대소문자)를 모두 만족할수 있게 한다
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;	
		default:
			System.out.println("손님입니다.");	
		}

	}

}
