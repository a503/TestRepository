package ch06.homework03.check;

public class Account {
	//�ۼ� ��ġ
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= 0 && balance <= 1000000){
			this.balance = balance;
		}
	}
	
	
}
