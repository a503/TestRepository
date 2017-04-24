package ch07.exam07.homework07_1._3;

public class Computer extends Calculator{
	// 상속받은 부모의 메소드를 재정의 했다(오버라이드)
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	double superAreaCircle(double r){
		return super.areaCircle(r);
	}
}
