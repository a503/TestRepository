package ch06.exam05;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) throws Exception{
		Member[] members = new Member[100]; // Member[] 타입의 members 변수를 선언하고 멤버객체 100개의 번지를 지정할수있는 배열 생성
		
		Scanner scanner = new Scanner(System.in);
		String strNum;
		
		while(true){
			System.out.println("------------------------------------");
			System.out.println("1. 회원가입 | 5. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			//String strNum = scanner.nextLine();
			strNum = scanner.nextLine();
			
			if(strNum.equals("1")){
				System.out.println("1번 실행");
				String name = scanner.nextLine();
				//String strAge = scanner.nextLine();
				//int age = Integer.parseInt(strAge);
				int age = Integer.parseInt(scanner.nextLine());
				Member member = new Member(name, age);
				for(int i = 0 ; i < members.length ; i++){
					if(members[i] == null){
						members[i] = member;
						break;
					}
				}
				
			}else if(strNum.equals("5")){
				System.out.println("5번 실행");
				break;
				//System.exit(0);
			}
			
		}
		
	}

}
