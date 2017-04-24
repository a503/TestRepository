package ch07.exam08;

public abstract class Tire {
	//Field
	private int diameter;
	//Constructor
	Tire(){
		System.out.println("Tire 객체 생성");
	}// new로 객체를 생성하지 못한다고 생성자가 실행 되지 않는 것은 아니다. 자식의 생성자에서 super()를 이용해 객체를 생성한다.
	//Method
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	// abstract Method
	abstract void roll(); // 추상 메소드; 실행 블록 없음.
	
	//추상 클래스라고해서 다른 일반 멤버를 정의하지 못하는것은 아니다.
}
