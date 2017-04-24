package ch07.exam07.homework07_1._2;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		//People에서 상속받은 필드 출력
		//Student의 생성자에서 super()를 이용해 People의 필드에 접근.
		//자식의 객체를 생성하기 위해서는 부모의 객체가 있어야 하므로
		//name, ssn 필드의 값이 들어간후, Student객체가 생기면서 studentNo에 값이 들어갔다.
		//부모와 자식간의 객체 생성순서 확인
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		
		//Student의 필드
		System.out.println("studentNo : " + student.studentNo);
	}

}
