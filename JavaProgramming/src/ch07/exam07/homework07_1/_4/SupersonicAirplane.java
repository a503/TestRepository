package ch07.exam07.homework07_1._4;

public class SupersonicAirplane extends Airplane{
	//Field
	//상수, 초기화까지 완료, 더 이상 프로그램실행도중 변경 불가.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC){
			System.out.println("초음속 비행중");
		}else{
			super.fly(); // 오버라이딩된 부모의 메소드 호출.
		}
	}
}
