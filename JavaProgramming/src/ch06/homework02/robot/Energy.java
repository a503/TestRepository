package ch06.homework02.robot;

public class Energy {
	//Field
	int powerLevel = 100;
	//Constructor
	
	//Method
	void charge(){
		powerLevel = 100;
		System.out.println("���͸��� ����Ǿ����ϴ�.");
		getPowerLevel();
	}
	void warning(){
		System.out.println("~~Warning~~");
		getPowerLevel();
		System.out.println("���͸��� �����մϴ�. �����ϼ���.");
	}
	boolean emptyPower(boolean status){
		getPowerLevel();
		System.out.println("������ �� �� �����ϴ�...");
		status = false;
		return status;
	}
	void getPowerLevel(){
		System.out.println("���� ���͸� �뷮 : " + powerLevel + "%");
	}
}
