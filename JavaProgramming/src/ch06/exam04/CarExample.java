package ch06.exam04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("2017-03-28", "����");
		//Engine�� �޼ҵ� ȣ�� // start
		myCar.engine.start();
		//Dashboard method call
		myCar.dashboard.display(60);
		//Tire location(������ �� ����) field value Read
		System.out.println(myCar.tires[0].location);
		//Tire method call
		myCar.tires[2].roll();
		//Car�� �޼ҵ� ȣ��
		myCar.start(); // Car�� start()�� engine.start()�� ȣ��
		myCar.run();
		//Engine�� �޼ҵ� ȣ�� // stop
		myCar.engine.stop();
		
		//------------------------------------------------------
		//��ǰ ��ü
		myCar.tires[1] = new Tire("(new)���� ��");
		System.out.println("\n");
		myCar.run();
		//-------------------------------------------------------
		
	}

}
