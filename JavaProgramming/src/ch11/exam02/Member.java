package ch11.exam02;

public class Member {
	// Field
	private String id;
	// Constructor
	Member(String id){
		this.id = id;
	}
	// Method
	@Override
	public int hashCode() {
		return id.hashCode(); // 문자열이 같다면 동일한 해쉬코드가 나오게 재정의
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member){
			Member target = (Member) obj;
			if(id.equals(target.id)){
				return true;
			}
		}
		return false;
	}	
}
