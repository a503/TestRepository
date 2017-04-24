package ch05.homework01;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception{
		boolean run = true; // while문을 무한반복시키기위해 선언
		int speed = 0; // 현재 속도
		int keyCode = 0; //키보드에서 받는 키 코드
		
		while(run){ // run의 값이 false가 되기 전까지 계속 반복한다.
			if(keyCode != 13 && keyCode != 10){ // 엔터키의 있는 캐리지리턴(13), 라인피드(10)가 입력될경우 실행하지 않기 위해서 조건 생
				System.out.println("-----------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-----------------------------");
				System.out.print("선택 : "); // println과 다르다 개행하지 않고 커서 유지
			}
			keyCode = System.in.read(); // 키보드의 입력값(int형)을 반환, throws Exception은 나중에 설명
			
			if(keyCode == 49){ // 입력 1.
				speed++; //속도 증가
				System.out.println("현재 속도 = " + speed);
			}else if(keyCode == 50){ // 입력 2
				speed--; //속도 감소
				System.out.println("현재 속도 = " + speed);
			}else if(keyCode == 51){ // 입력 3
				run = false; //조건문을 거짓으로 바꾸어 while문을 종료
				// retrun; main메소드를 종료시켜 jvm 종료
				// System.exit(0); 강제로 jvm 종료
			}
		}
		System.out.println("프로그램 종료");
	}

}
