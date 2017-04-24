package ch05.exam02;

public class MainArgumentExample {

	public static void main(String[] args) {
		if(args.length == 2){
			String v1 = args[0];
			String v2 = args[1];
			
			int intV1 = Integer.parseInt(v1); // 문자열을 인트값으로 변화해서 대입해준다. 숫자화 할 수 없는 문자가 들어갈경우 에러처리된다.
			int intV2 = Integer.parseInt(v2);
			//System.out.println(v1);
			//System.out.println(v2);
			System.out.println(intV1 + intV2);
		}else{
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		}
		
		// 클래스의 전체이름은 ch05.exam02.MainArgumentExample 이다.
	}

}
