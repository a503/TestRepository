package ch07.exam07.homework07_1._6;

public class SportCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	/* 부모의 메소드가 final로 선언되어있기 때문에 메소드를 오버라이드 할 수 없다.
	 * final method는 더 이상 재정의 하지 못하게 한다.
	@Override
	public void stop(){
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
