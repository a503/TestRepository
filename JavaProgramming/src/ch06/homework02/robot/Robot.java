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
		System.out.println("�κ��� �۵��߽��ϴ�.");
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
			System.out.println("�̸��� �����մϴ�.");
			System.out.print("�̸� �Է�> ");
			name = sc.nextLine();
		}
		else if(selectFunction == 5){
			System.out.println("�ʱ� �޴��� �̵�");
			System.out.println();
		}
			
	}
	void info(){
		System.out.println("������ : " + makeDay);
		System.out.println("�𵨸� : " + model);
		System.out.println("�� �� : " + name);
		if(status){
			System.out.println("���� ���� : ������" );
		}
		else{
			System.out.println("���� ���� : ����");
		}
		System.out.println("���͸� : " + energy.powerLevel);
		System.out.println("������ġ : " + (int)location);
	}
	void stop(){
		status = false;
		System.out.println("�κ��� ������ ������ϴ�.");
	}
}
