package ch06.exam01;

public class Car {
	//Field(�ʵ�)
	//String company; // ȸ��� 
	String company = "�����ڵ���";
	int speed; // �ӵ�
	String color;
	boolean airback;
	
	//Constructor(������)
	Car (){
		//System.out.println("Car ��ü ����");
	}
	
	//Method(�޼ҵ�)
	void run(){
		System.out.println("���� " + speed + "km/h �� �޸��ϴ�.");
	}
}
