package ch06.exam04;

public class Car {
	//Field
	Body body; // Body body = new Body();
	Engine engine = new Engine();
	Dashboard dashboard = new Dashboard();
	Seat[] seats= { // seatŸ�� �迭�� 4���� Seat ����
			new Seat(),
			new Seat(),
			new Seat(),
			new Seat()
	};
	Tire[] tires = {
			new Tire("������ ��"),
			new Tire("���� ��"),
			new Tire("������ ��"),
			new Tire("���� ��")
	};
	String makeDay;
	String color;
	int speed; // ���� ������ �̹Ƿ� ���÷� ���ϱ⶧���� �����ڿ��� ���� �޾ƿ��� �ʴ´�.
	//Constructor
	Car(String makeDay, String color){
		this.makeDay = makeDay;
		this.color = color;
	}
	//Method
	void start(){
		engine.start();
	}
	void run(){
		//while(true){
			tires[0].roll();
			tires[1].roll();
			tires[2].roll();
			tires[3].roll();
			
			this.setSpeed(60);
			
			dashboard.display(60);
		//}
	}
	void setSpeed(int speed){
		this.speed = speed;
	}
	void stop(){
		engine.stop();
		this.speed = 0;
	}
}
