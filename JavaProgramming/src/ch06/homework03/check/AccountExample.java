package ch06.homework03.check;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("���� �ܰ� : " + account.getBalance());
		
		account.setBalance(10000);
		System.out.println("���� �ܰ� : " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("���� �ܰ� : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("���� �ܰ� : " + account.getBalance());
	}

}
