package ch07.exam07.homework07_1._2;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo){
		super(name, ssn); // super()를 이용하여 부모의 생성자 호출, 매개값과 함께 호출했다.
		this.studentNo = studentNo;
	}
}
