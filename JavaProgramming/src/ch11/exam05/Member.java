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
	// �Ҹ���. �ڹٿ����� �� ������� �ʴ´� 
	@Override // ������ �ݷ��Ϳ��� ���ŵɶ� ����ȴ�.
	protected void finalize() throws Throwable {
		System.out.println(id+ "�� ���ŵ�");
	}
}
