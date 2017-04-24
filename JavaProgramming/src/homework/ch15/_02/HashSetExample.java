package homework.ch15._02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()){
			Student student = iterator.next();
			System.out.println(student.getStudentNum() + ": " + student.getName());
		}
	}
}
