package ch07.exam07.homework07_1._1;

public class DmbCellPhone extends CellPhone {
	//Field
	int channel;
	
	//Constructor
	DmbCellPhone(String model, String color, int channel){
		this.model = model; // �θ�(CellPhone)�κ��� ��ӹ��� �ʵ�
		this.color = color; // �θ�(CellPhone)�κ��� ��ӹ��� �ʵ�
		this.channel = channel; // �ڽ��� �ʵ�
	}
	//Method
	void turnOnDmb(){
		System.out.println("ä�� " + this.channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel){
		this.channel = channel;
		System.out.println("ä�� " + this.channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb(){
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
