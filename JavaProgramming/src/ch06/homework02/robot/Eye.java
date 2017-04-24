package ch06.homework02.robot;

public class Eye {
	//Field
	//Constructor
	//Method
	void takePicture(Energy energy){
		System.out.println("사진을 촬영했습니다.");
		energy.powerLevel -= 10;
	}
}
