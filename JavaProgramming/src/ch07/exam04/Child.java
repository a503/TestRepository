package ch07.exam04;

public class Child extends Parent{
	//Field
	String firstName;
	//Constructor
	Child (String lastName, String firstName){
		super(lastName);
		this.firstName = firstName;
	}
	//Method
	void play(){
		System.out.println("Let's play~");
	}
	@Override
	void sound(){
		//super.sound();
		System.out.println("kikikikikiki");
	}
	void parentSound(){
		super.sound();
	}
	
}
