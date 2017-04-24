package homework.ch11;

public class Student {
	private String studentNum;
	
	public Student(String studentNum){
		this.studentNum = studentNum;
	}
	
	public String getStudentNum(){
		return this.studentNum;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student target = (Student) obj;
			if(studentNum.equals(target.studentNum)){
				return true;
			}
		}
		return false;
	}
}
