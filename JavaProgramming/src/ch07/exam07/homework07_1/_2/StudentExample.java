package ch07.exam07.homework07_1._2;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-1234567", 1);
		//People���� ��ӹ��� �ʵ� ���
		//Student�� �����ڿ��� super()�� �̿��� People�� �ʵ忡 ����.
		//�ڽ��� ��ü�� �����ϱ� ���ؼ��� �θ��� ��ü�� �־�� �ϹǷ�
		//name, ssn �ʵ��� ���� ����, Student��ü�� ����鼭 studentNo�� ���� ����.
		//�θ�� �ڽİ��� ��ü �������� Ȯ��
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		
		//Student�� �ʵ�
		System.out.println("studentNo : " + student.studentNo);
	}

}
