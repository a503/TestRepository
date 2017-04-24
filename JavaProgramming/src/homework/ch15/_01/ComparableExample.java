package homework.ch15._01;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();	
		set.add(new Person("ȫ�浿", 45));
		set.add(new Person("���ڹ�", 25));
		set.add(new Person("������", 31));
		
		for(Person p : set){
			System.out.print(p.getName() + "(" + p.getAge() + ")");
			System.out.println();
		}
	}
}
