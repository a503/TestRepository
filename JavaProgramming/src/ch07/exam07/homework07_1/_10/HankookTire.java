package ch07.exam07.homework07_1._10;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	@Override // 출력을 달리하기 위해 재정의한 roll() 메소드, HankookTire
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation){
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else{
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
