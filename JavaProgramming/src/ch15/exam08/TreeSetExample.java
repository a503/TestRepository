package ch15.exam08;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		/*
		 * 입사시험:
		 * Person(Comparable을 구현하지 않은, 비교기능이 없는)객체를 주고 수정하지 않고 사용해라.
		 * 비교기능이 없는 클래스에게 외부에서 비교기능을 주자
		 * 외부에서 주는 비교자(Comparator)
		 * NHN 시험 문제
		 * 비교기능이 있는 클래스에도 비교자를 주면 비교자가 우선순위를 가진다.
		 */
		/*
		TreeSet<Person> set = new TreeSet<>(); // 비교기능이 없으니 에러 발생
		set.add(new Person("홍길동", 45));
		set.add(new Person("감자바", 25));
		set.add(new Person("박지원", 31));
		for(Person p : set){
			System.out.print(p.getName() + "(" + p.getAge() + ")");
			System.out.println();
		}
		*/
		TreeSet<Person> set = new TreeSet<>(new CompareByAge());
		set.add(new Person("홍길동", 45));
		set.add(new Person("감자바", 55));
		set.add(new Person("박지원", 25));
		for(Person p : set){
			System.out.print(p.getName() + "(" + p.getAge() + ")");
			System.out.println();
		}
		
		
	}
}
