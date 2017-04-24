package homework.ch15._01;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name){
		this.sno = sno;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student student = (Student)obj;
			if((this.sno == student.sno) && (this.name.equals(student.name))){
				return true;
			}
		}
		return false;
	}
}
