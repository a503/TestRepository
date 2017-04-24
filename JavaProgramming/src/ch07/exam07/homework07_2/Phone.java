package ch07.exam07.homework07_2;

public abstract class Phone {
	public String owner;
	
	public Phone(){
		
	}
	
	public Phone(String owner){
		this.owner = owner;
	}
	
	public void turnOn(){
		System.out.println("휴대폰 전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println("휴대폰 전원을 끕니다.");
	}
}
