package ch07.exam07.homework07_1._11;

public class Tire {
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll(){
		++accumulatedRotation; // 누적 회전수 증가
		if(accumulatedRotation < maxRotation){
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회"); //정상회전, 수명 보여준다.
			return true;
		}else{
			System.out.println("*** " + location + " Tire 펑크 ***"); // 누적회전수가 최대회전수가 같아질때 실행, 펑크를 의미
			return false;
		}
	}
}
