package homework.ch15._02;

public class Student1 implements Comparable<Student1>{
	public String id;
	public int score;
	
	public Student1(String id, int score){
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student1 o) {
		return Integer.compare(this.score, o.score);
	}
	
}
