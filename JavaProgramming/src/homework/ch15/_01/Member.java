package homework.ch15._01;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override // �������� ��� ���� ��ü�� �Ǵ��ϱ����� ������
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override // �������� ��� ���� ��ü�� �Ǵ��ϱ����� ������
	public boolean equals(Object obj) {
		if(obj instanceof Member){
			Member member = (Member) obj;
			if((member.name.equals(this.name)) && (member.age == this.age)){ //�̸��� ���� ��� ���ƾ� ���������� ����.
				return true;
			}
		}
		return false;
	}	
}
