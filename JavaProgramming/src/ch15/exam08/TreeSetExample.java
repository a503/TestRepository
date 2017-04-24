package ch15.exam08;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		/*
		 * �Ի����:
		 * Person(Comparable�� �������� ����, �񱳱���� ����)��ü�� �ְ� �������� �ʰ� ����ض�.
		 * �񱳱���� ���� Ŭ�������� �ܺο��� �񱳱���� ����
		 * �ܺο��� �ִ� ����(Comparator)
		 * NHN ���� ����
		 * �񱳱���� �ִ� Ŭ�������� ���ڸ� �ָ� ���ڰ� �켱������ ������.
		 */
		/*
		TreeSet<Person> set = new TreeSet<>(); // �񱳱���� ������ ���� �߻�
		set.add(new Person("ȫ�浿", 45));
		set.add(new Person("���ڹ�", 25));
		set.add(new Person("������", 31));
		for(Person p : set){
			System.out.print(p.getName() + "(" + p.getAge() + ")");
			System.out.println();
		}
		*/
		TreeSet<Person> set = new TreeSet<>(new CompareByAge());
		set.add(new Person("ȫ�浿", 45));
		set.add(new Person("���ڹ�", 55));
		set.add(new Person("������", 25));
		for(Person p : set){
			System.out.print(p.getName() + "(" + p.getAge() + ")");
			System.out.println();
		}
		
		
	}
}
