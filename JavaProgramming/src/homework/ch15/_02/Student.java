package homework.ch15._02;

public class Student {
	private int studentNum;
	private String name;
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return this.studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student student = (Student) obj;
			if(this.studentNum == student.studentNum){
				return true;
			}
		}
		return false;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public String getName() {
		return name;
	}
}
