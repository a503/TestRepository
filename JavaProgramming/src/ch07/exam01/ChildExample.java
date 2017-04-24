package ch07.exam01;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		System.out.println("my name is " + child.lastName + " " +child.firstName);
		child.sound();
		child.play();
	}

}
