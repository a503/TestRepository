package ch07.exam07.homework07_2;

public abstract class Phone {
	public String owner;
	
	public Phone(){
		
	}
	
	public Phone(String owner){
		this.owner = owner;
	}
	
	public void turnOn(){
		System.out.println("�޴��� ������ �մϴ�.");
	}
	public void turnOff(){
		System.out.println("�޴��� ������ ���ϴ�.");
	}
}
