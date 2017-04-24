package ch11.exam05;

public class Member {
	// Field
	private String id;
	// Constructor
	Member(String id){
		this.id = id;
	}
	@Override
	public String toString() {
		return this.id;
	}
	// 소멸자. 자바에서는 잘 사용하지 않는다 
	@Override // 가비지 콜렉터에서 제거될때 실행된다.
	protected void finalize() throws Throwable {
		System.out.println(id+ "가 제거됨");
	}
}
