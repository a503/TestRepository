package ch06.homework02.robot;

import java.util.Scanner;

public class RobotExample {

	public static void main(String[] args) {
		Robot myRobot = new Robot("hyunkyu's robot");
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		

		while(run){
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. ���� | 4. ���� Ȯ�� | 5. ���� | 6. ���α׷� ����");
			System.out.println("---------------------------------------------------------------");
			System.out.print("����> ");
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
					System.out.println("���� �κ��� �۵����ּ���.");
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
						System.out.println("1. ���� �Կ� | 2. ������ �̵� | 3. �ڷ� �̵� | 4. �̸� ���� | 5. �ʱ� �޴��� �̵�");
						System.out.println("---------------------------------------------------------");
						System.out.print("����> ");
						int selectFunction = sc.nextInt();
						myRobot.function(selectFunction);
						break;
						
					}
				}
			case 3:
				if(myRobot.energy.powerLevel == 100){
					System.out.println("���͸��� ���� �����Դϴ�.");
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
		System.out.println("���α׷� ����.");
		sc.close();
	}

}
