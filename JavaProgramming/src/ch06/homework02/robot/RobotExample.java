package ch06.homework02.robot;

import java.util.Scanner;

public class RobotExample {

	public static void main(String[] args) {
		Robot myRobot = new Robot("hyunkyu's robot");
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		

		while(run){
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. 시작 | 2. 기능 | 3. 충전 | 4. 정보 확인 | 5. 정지 | 6. 프로그램 종료");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			switch(selectNo){
			case 1:
				if(myRobot.energy.powerLevel == 0){
					myRobot.energy.emptyPower(myRobot.status);
					break;
				}
				else{
					if(myRobot.energy.powerLevel > 0 && myRobot.energy.powerLevel <= 50)
						myRobot.energy.warning();
					myRobot.start();
					break;
				}
			case 2:
				if(myRobot.status == false){
					System.out.println("먼저 로봇을 작동해주세요.");
					break;
				}else{
					if(myRobot.energy.powerLevel == 0){
						myRobot.energy.emptyPower(myRobot.status);
						break;
					}else{
						if(myRobot.energy.powerLevel > 0 && myRobot.energy.powerLevel <= 40){
							myRobot.energy.warning();
						}						
						System.out.println();
						System.out.println("---------------------------------------------------------");
						System.out.println("1. 사진 촬영 | 2. 앞으로 이동 | 3. 뒤로 이동 | 4. 이름 변경 | 5. 초기 메뉴로 이동");
						System.out.println("---------------------------------------------------------");
						System.out.print("선택> ");
						int selectFunction = sc.nextInt();
						myRobot.function(selectFunction);
						break;
						
					}
				}
			case 3:
				if(myRobot.energy.powerLevel == 100){
					System.out.println("배터리가 완충 상태입니다.");
					break;
				}else{
					myRobot.energy.charge();
					break;
				}
			case 4:
				myRobot.info();
				break;
			case 5:
				myRobot.stop();
				break;
			case 6:
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
		sc.close();
	}

}
