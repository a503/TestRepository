package ch06.homework03;

public class SingletonExample {

	public static void main(String[] args) {
		// Singleton obj1 = new Singleton(); 생성자가 private설정이 되어있기 때문에 외부에서 생성자를 호출할수없으므로 컴파일 에러 발생
		
		Singleton obj1 = Singleton.getInstance(); // 클래스명을 이용하여 정적메소드에 접근했다. 이 메소드는 해당 클래스에서 생성한 객체의 주소값을 반환 하므로
													// 클래스 참조변수 obj1에는 해당 객체의 주소값이 들어온다.
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2){ // 같은 객체의 주소값을 가지고 있는 증명
			System.out.println("같은 Singleton 객체 입니다.");
			//System.out.println(obj1);
			//System.out.println(obj1.toString());
		}else{
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
