package homework.ch15._02;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student1> treeSet = new TreeSet<>();
		
		treeSet.add(new Student1("blue", 96));
		treeSet.add(new Student1("hong", 86));
		treeSet.add(new Student1("white", 92));
		
		Student1 student = treeSet.last();
		System.out.println("�ְ����� : " + student.score);
		System.out.println("�ְ������� ���� ���̵� : " + student.id);
	}
}