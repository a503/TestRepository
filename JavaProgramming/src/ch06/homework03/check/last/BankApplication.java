package ch06.homework03.check.last;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run){
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();scanner.nextLine();
			
			if(selectNo == 1){
				createAccount();
			}else if(selectNo == 2){
				accountList();
			}else if(selectNo == 3){
				deposit();
			}else if(selectNo == 4){
				withdraw();
			}else if(selectNo == 5){
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌생성
	private static void createAccount(){ 
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0 ; i < accountArray.length ; i++){
			if(accountArray[i] == null){
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	//계좌목록
	private static void accountList(){
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for(int i = 0 ; i < accountArray.length ; i++){
			 System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			 if(accountArray[i+1] == null){
				 break;
			 }
		}
	}
	//예금하기
	private static void deposit(){
		System.out.println("-------");
		System.out.println("예    금");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		Account depositFunction = findAccount(ano);
		System.out.print("예금액 : ");
		int deposit = Integer.parseInt(scanner.nextLine());
		depositFunction.setBalance(deposit + depositFunction.getBalance());
	}
	//출금하기
	private static void withdraw(){
		System.out.println("-------");
		System.out.println("출    금");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		Account depositFunction = findAccount(ano);
		System.out.print("출금액 : ");
		int deposit = Integer.parseInt(scanner.nextLine());
		depositFunction.setBalance(depositFunction.getBalance() - deposit);
	}
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano){
		for(int i = 0 ; i < accountArray.length ; i++){
			if(accountArray[i].getAno().equals(ano)){
				return accountArray[i];
			}
		}
		return null;
	}

}
