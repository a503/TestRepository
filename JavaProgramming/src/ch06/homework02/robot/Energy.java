package ch06.homework02.robot;

public class Energy {
	//Field
	int powerLevel = 100;
	//Constructor
	
	//Method
	void charge(){
		powerLevel = 100;
		System.out.println("배터리가 완충되었습니다.");
		getPowerLevel();
	}
	void warning(){
		System.out.println("~~Warning~~");
		getPowerLevel();
		System.out.println("배터리가 부족합니다. 충전하세요.");
	}
	boolean emptyPower(boolean status){
		getPowerLevel();
		System.out.println("동작을 할 수 없습니다...");
		status = false;
		return status;
	}
	void getPowerLevel(){
		System.out.println("현재 배터리 용량 : " + powerLevel + "%");
	}
}
