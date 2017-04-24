package ch07.exam07.homework07_1._10;

public class Car {
	//Field, 자동차의 4개의 타이어 생성, 최대 회전수가 다 다르다.
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// Method
	// 모든 타이어를 1회 회전시킨다.
	int run(){
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false){
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false){
			stop();
			return 2;		
		}
		if(backLeftTire.roll() == false){
			stop();
			return 3;
		}
		if(backRightTire.roll() == false){
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop(){
		System.out.println("[자동차가 멈춥니다.]"); // 펑크가 났을때(누적 회전수 = 최대 회전수)
	}
}
