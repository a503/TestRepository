package ch11.exam13;

public class Member implements Comparable<Member>{ // Comparable<Member> : 멤버는 멤버끼리
	private String name;
	private int age;
	
	public Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return this.name + "(" + age + ")";
	}
	@Override
	public int compareTo(Member member) {
		//문자열을 통해 비교방식
		//이름
		return this.name.compareTo(member.toString());
		
		//나이를 기준으로 비교
		//return Integer.compare(this.age, member.age);
		/*//위의 방식과 같은방식
		if(age == member.age){
			return 0;
		}else if(age > member.age){
			return 1;
		}else{
			return -1;
		}
		*/
	}
	//오버로딩
	public int compareTo(){
		return age;
	}

}
