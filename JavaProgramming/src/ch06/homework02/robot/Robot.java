package ch06.homework02.robot;

import java.util.Scanner;

public class Robot {
	//Field
	Head head = new Head();
	//Body body = new Body();
	Arm[] arm = {
			new Arm(),
			new Arm()
	};
	Leg[] leg = {
			new Leg(),
			new Leg()
	};
	Energy energy = new Energy();
	
	String makeDay = "2017-03-28";
	String model = "Hbot";
	String name;
	
	double location = 0.0;
	
	boolean status = false;
	
	Scanner sc = new Scanner(System.in);
	
	//Constructor
	Robot(String name){
		this.name = name;
	}
	//Method
	void start(){
		status = true;
		System.out.println("로봇이 작동했습니다.");
	}
	void function(int selectFunction){
		if(selectFunction == 1){
			head.eye.takePicture(energy);
		}
		else if(selectFunction == 2){
			location = leg[0].moveForward(location, energy);
			location = leg[1].moveForward(location, energy);
		}
		else if(selectFunction == 3){
			location = leg[0].moveBackward(location, energy);
			location = leg[1].moveBackward(location, energy);
		}
		else if(selectFunction ==  4){
			System.out.println("이름을 변경합니다.");
			System.out.print("이름 입력> ");
			name = sc.nextLine();
		}
		else if(selectFunction == 5){
			System.out.println("초기 메뉴로 이동");
			System.out.println();
		}
			
	}
	void info(){
		System.out.println("제조일 : " + makeDay);
		System.out.println("모델명 : " + model);
		System.out.println("이 름 : " + name);
		if(status){
			System.out.println("현재 상태 : 동작중" );
		}
		else{
			System.out.println("현재 상태 : 정지");
		}
		System.out.println("배터리 : " + energy.powerLevel);
		System.out.println("현재위치 : " + (int)location);
	}
	void stop(){
		status = false;
		System.out.println("로봇이 동작을 멈췄습니다.");
	}
}
