package ch15.exam07;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		/*
		//TreeSet<Integer> set = new TreeSet<>(); // ������������ ����, ������ ����
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());// descendingSet�� ���� �ʰ� ���ʿ� ����ɶ� ������������ �����ϰ� �ʹ�. ū�� ����
		
		set.add(87); // �ڵ� �ڽ�
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);
		for(int score : set){ // ��������(���ʺ��� ����Ѵ�), �׷��� �������� �޼ҵ�� ����.
			System.out.print(score + " ");
		}*/
		//TreeSet<Person> set = new TreeSet<>(Collections.reverseOrder()); // ����ɶ� ū���� ���� ����ȴ�.
		TreeSet<Person> set = new TreeSet<>();	
		set.add(new Person("ȫ�浿", 45));
		set.add(new Person("���ڹ�", 25));
		set.add(new Person("������", 31));
		//for(Person p : set.descendingSet()){
		for(Person p : set){
			System.out.print(p.getName() + "(" + p.getAge() + ")");
			System.out.println();
		}
	}
}
