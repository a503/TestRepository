package ch05.homework01;

public class IfDiceExample {
	// 0.0 <= Math.random() <1.0 더블 타입의 난수 생성, 각변에 연산을해 범위 조정 가능, (int)로 정수형으로 형변환
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; // 주사위 숫자(1~6)
		//System.out.println("랜덤값 확인 : " + num);
		if(num == 1){
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2){
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3){
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4){
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5){
			System.out.println("5번이 나왔습니다.");
		}else{
			System.out.println("6번이 나왔습니다.");
		}
	}

}
