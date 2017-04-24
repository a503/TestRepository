package ch10.exam04;

public class ThrowsExample {

	public static void main(String[] args) {
		try{
			Class.forName(" ");
			System.in.read();
		}catch(Exception e){
			//예외 처리 코드
			System.out.println("알수 없는 예외 발생");
		}
		try{
			devide(10, 0);
		}catch(ArithmeticException e){
			System.out.println("다십 입력하세요");
		}
		
	}
	static void devide(int x, int y) throws ArithmeticException{
		int result = x / y; // ArithmeticException
	}

}
