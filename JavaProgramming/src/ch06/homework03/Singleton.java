package ch06.homework03;

public class Singleton {
	// Singleton singleton = new Singleton(); // 2번 클래스 내부이므로 객체생성가능
	//static Singleton singleton = new Singleton(); // 4번 정적메소드에서 필드값을 리턴하기위해 필드를 사용해야하므로 필드 역시 정적 필드로 설정
	private static Singleton singleton = new Singleton(); // 5번 외부에서 static필드에 직접접근을 막기위해 private설정 
	
	private Singleton(){} // 1번
	
	static Singleton getInstance(){ // 3번 객체의 주소값을 반환하는 메소드를 생성한다. 하지만 외부에서 객체를 생성할수 없으므로 이 메소드에 접근할 수 없다.
								// 그러므로 외부에서 이 메소드에 객체없이 접근할 수 없도로 static 메소드로 설정
		return singleton;
	}
}
