package ch06.exam05;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) throws Exception{
		Member[] members = new Member[100]; // Member[] Ÿ���� members ������ �����ϰ� �����ü 100���� ������ �����Ҽ��ִ� �迭 ����
		
		Scanner scanner = new Scanner(System.in);
		String strNum;
		
		while(true){
			System.out.println("------------------------------------");
			System.out.println("1. ȸ������ | 5. ����");
			System.out.println("------------------------------------");
			System.out.print("����> ");
			//String strNum = scanner.nextLine();
			strNum = scanner.nextLine();
			
			if(strNum.equals("1")){
				System.out.println("1�� ����");
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
				System.out.println("5�� ����");
				break;
				//System.exit(0);
			}
			
		}
		
	}

}
