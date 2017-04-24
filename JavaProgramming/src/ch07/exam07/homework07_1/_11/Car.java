package ch07.exam07.homework07_1._11;

public class Car {
	//Field 배열로 여러개의 객체를 관리
	Tire[] tires = {
		new Tire("앞왼쪽", 6),
		new Tire("앞오른쪽", 2),
		new Tire("뒤왼쪽", 3),
		new Tire("뒤오른쪽", 4)
	};
	// Method
	// 모든 타이어를 1회 회전시킨다.
	int run(){
		System.out.println("[자동차가 달립니다.]");
		for(int i = 0 ; i<tires.length ; i ++ ){
			if(tires[i].roll() == false){
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop(){
		System.out.println("[자동차가 멈춥니다.]"); // 펑크가 났을때(누적 회전수 = 최대 회전수)
	}
}
