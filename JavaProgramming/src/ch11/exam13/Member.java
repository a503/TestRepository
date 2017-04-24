package ch11.exam13;

public class Member implements Comparable<Member>{ // Comparable<Member> : ����� �������
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
		//���ڿ��� ���� �񱳹��
		//�̸�
		return this.name.compareTo(member.toString());
		
		//���̸� �������� ��
		//return Integer.compare(this.age, member.age);
		/*//���� ��İ� �������
		if(age == member.age){
			return 0;
		}else if(age > member.age){
			return 1;
		}else{
			return -1;
		}
		*/
	}
	//�����ε�
	public int compareTo(){
		return age;
	}

}
