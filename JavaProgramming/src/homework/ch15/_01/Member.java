package homework.ch15._01;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override // 논리동등일 경우 같은 객체로 판단하기위해 재정의
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override // 논리동등일 경우 같은 객체로 판단하기위해 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Member){
			Member member = (Member) obj;
			if((member.name.equals(this.name)) && (member.age == this.age)){ //이름과 나이 모두 같아야 논리동등으로 본다.
				return true;
			}
		}
		return false;
	}	
}
