package ch07.exam07.homework07_1._2;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo){
		super(name, ssn); // super()�� �̿��Ͽ� �θ��� ������ ȣ��, �Ű����� �Բ� ȣ���ߴ�.
		this.studentNo = studentNo;
	}
}
