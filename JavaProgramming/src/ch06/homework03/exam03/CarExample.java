package ch06.homework03.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);// 잘못된 값(음수가 들어감)
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		if(!myCar.isStop()){
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
