package ch07.exam07.homework07_1._4;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff(); 
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // ���ۼҴ� Ŭ������ �ö��� �޼ҵ忡�� if������ ������Ű�� ���� else ����� ���� -> �θ��� �޼ҵ� ȣ��
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
