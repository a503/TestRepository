package homework.ch13;

import java.util.function.ToIntFunction;

public class LambdaExample3 {
	private static Student[] students = {
			new Student("Hong", 90, 96),
			new Student("Shin", 95, 93)
	};
	
	public static double avg(ToIntFunction<Student> s){
		int sum = 0;
		for(int i = 0 ; i < students.length ; i ++){
			sum += s.applyAsInt(students[i]);
		}
		double result = (double) sum/students.length;
		return result;
		
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s->s.getEnglishScore() );
		System.out.println("영어 평균 점수 : " + englishAvg);
		
		double mathAvg = avg(s->s.getMathScore() );
		System.out.println("수학 평균 점수 : " + mathAvg);
	}
	
	public static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore){
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName(){return name;}
		public int getEnglishScore(){return englishScore;}
		public int getMathScore(){return mathScore;}
	}
}
