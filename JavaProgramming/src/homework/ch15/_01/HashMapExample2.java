package homework.ch15._01;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);
		
		System.out.println("�� Entry �� : " + map.size());
	}
}	
