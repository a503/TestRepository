package ch06.exam03;

public class Car {
	//Field(�ʵ�)
	//String company; // ȸ��� 
	String company = "�����ڵ���";
	int speed; // �ӵ�
	String color;
	boolean airback;
	
	//Constructor(������)
	Car (){
		this("�����ڵ���",null, false);
	}
	Car (String color, boolean airback){ // ���� �����Ҷ��� �ʵ��� �Ű��������� ��ġ��Ų��.
		this("�����ڵ���", color, airback);
	}
	Car (String company, String color, boolean airback){
		this.company = company;
		this.color = color;
		this.airback = airback;
	}
	
	
	//Method(�޼ҵ�)
	void run(){
		System.out.println("���� " + speed + "km/h �� �޸��ϴ�.");
	}
}
