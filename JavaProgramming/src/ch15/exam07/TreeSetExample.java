package ch15.exam07;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		/*
		//TreeSet<Integer> set = new TreeSet<>(); // 오름차순으로 저장, 작은게 왼쪽
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());// descendingSet을 쓰지 않고 애초에 저장될때 내림차순으로 저장하고 싶다. 큰게 왼쪽
		
		set.add(87); // 자동 박싱
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);
		for(int score : set){ // 오름차순(왼쪽부터 출력한다), 그래서 오름차순 메소드는 없다.
			System.out.print(score + " ");
		}*/
		//TreeSet<Person> set = new TreeSet<>(Collections.reverseOrder()); // 저장될때 큰것이 먼저 저장된다.
		TreeSet<Person> set = new TreeSet<>();	
		set.add(new Person("홍길동", 45));
		set.add(new Person("감자바", 25));
		set.add(new Person("박지원", 31));
		//for(Person p : set.descendingSet()){
		for(Person p : set){
			System.out.print(p.getName() + "(" + p.getAge() + ")");
			System.out.println();
		}
	}
}
