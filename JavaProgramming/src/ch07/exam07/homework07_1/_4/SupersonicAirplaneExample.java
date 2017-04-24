package ch07.exam07.homework07_1._4;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff(); 
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // 슈퍼소닉 클래스의 플라이 메소드에서 if조건을 만족시키지 못해 else 블록을 실행 -> 부모의 메소드 호출
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
