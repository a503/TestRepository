package ch07.exam07.homework07_1._10;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	@Override // 출력을 달리하기 위해 재정의한 roll() 메소드, KumhoTire
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation){
			System.out.println(location + " KumhoTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else{
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
