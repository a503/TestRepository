package ch07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child("Kim", "Ja-Va");
		
		System.out.println("my name is " + child.lastName + " " +child.firstName);
		child.sound();
		child.play();
		
		
	}

}
