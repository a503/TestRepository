package ch05.exam03;

public class ReadKeyCodeExample {

	public static void main(String[] args) throws Exception {
		
		System.out.println("------------------------------");
		System.out.println("1. 저장 | 2. 읽기 | 3. 종료");
		System.out.println("------------------------------");
		int keycode = 0;
		
		while(true){
			//int keycode = 0 ;
			if(keycode != 13 && keycode != 10){
				System.out.print("번호 선택 : ");
			}
			keycode = System.in.read(); // 메소드 이다.
			//System.out.println(keycode);
			
				switch(keycode){
				case 49:
					System.out.println("저장을 선택하셨습니다.");
					break;
				case 50:
					System.out.println("읽기를 선택하셨습니다.");
					break;
				case 51:
					System.out.println("종료를 선택하셨습니다.");
					//return; //main 메소드 종료
					System.exit(0); // 그 즉시 vm종료
				/*default:
					System.out.println("잘못 선택하셨습니다.");*/
				}
			
		}
	}

}
