package ch14.exam08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaExpressionExample {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("강현규", 95, 93));
	
	public static void main(String[] args) {
		printString(s->s.getName());
		printInt(s->s.getEnglishScore());
		printInt(s->s.getMathScore());
		//printInt2(s->s.getEnglishScore()); // 실행가능 function을 이용해 객체와 인티저를 매핑
		double engAvg = avg(s->s.getEnglishScore());
		System.out.println("영어 평균 점수 : " + engAvg);
		double mathAvg = avg(s->s.getMathScore());
		System.out.println("수학 평균 점수 : " + mathAvg);
		
	}
	public static void printString(Function<Student, String> function){
		for(Student student : list){
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	public static void printInt(ToIntFunction<Student> function){
		for(Student student : list){
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	public static double avg(ToIntFunction<Student> function){
		int sum = 0;
		for(Student student : list){
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	/*
	public static void printInt2(Function<Student, Integer> function){
		for(Student student : list){
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	*/
}
