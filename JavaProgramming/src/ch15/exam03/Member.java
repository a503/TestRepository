package ch15.exam03;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member){
			Member member = (Member) obj;
			if((member.name.equals(this.name)) && (member.age == this.age)){
				return true;
			}
		}
		return false;
	}	
}
