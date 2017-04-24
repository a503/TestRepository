package ch06.homework03.check.last;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run){
			System.out.println("--------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	//���»���
	private static void createAccount(){ 
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.nextLine();
		System.out.print("������ : ");
		String owner = scanner.nextLine();
		System.out.print("�ʱ��Աݾ� : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0 ; i < accountArray.length ; i++){
			if(accountArray[i] == null){
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	//���¸��
	private static void accountList(){
		System.out.println("-------");
		System.out.println("���¸��");
		System.out.println("-------");
		
		for(int i = 0 ; i < accountArray.length ; i++){
			 System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
			 if(accountArray[i+1] == null){
				 break;
			 }
		}
	}
	//�����ϱ�
	private static void deposit(){
		System.out.println("-------");
		System.out.println("��    ��");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.nextLine();
		Account depositFunction = findAccount(ano);
		System.out.print("���ݾ� : ");
		int deposit = Integer.parseInt(scanner.nextLine());
		depositFunction.setBalance(deposit + depositFunction.getBalance());
	}
	//����ϱ�
	private static void withdraw(){
		System.out.println("-------");
		System.out.println("��    ��");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.nextLine();
		Account depositFunction = findAccount(ano);
		System.out.print("��ݾ� : ");
		int deposit = Integer.parseInt(scanner.nextLine());
		depositFunction.setBalance(depositFunction.getBalance() - deposit);
	}
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano){
		for(int i = 0 ; i < accountArray.length ; i++){
			if(accountArray[i].getAno().equals(ano)){
				return accountArray[i];
			}
		}
		return null;
	}

}
