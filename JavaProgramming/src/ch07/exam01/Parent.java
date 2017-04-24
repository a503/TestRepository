package ch07.exam01;

public class Parent {
	//Field
	String lastName = "Kim";
	//Constructor
	//Parent(){ <-원래소스  public 테스트때문에 추가했다.
	public Parent(){
		System.out.println("This is Parent Constructor");
	}
	//Method
	void sound(){
		System.out.println("haha~");
	}
}
