package ch07.exam01;

public class Child extends Parent{
	//Field
	String firstName = "ja-va";
	//Constructor
	Child(){
		super();
		System.out.println("This is Child Constructor~");
	}
	//Method
	void play(){
		System.out.println("Let's play~");
	}
}
