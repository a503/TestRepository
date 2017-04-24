package ch15.exam06;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//Set<Integer> set = new TreeSet<>(); // �˻��� ���õ� �޼ҵ�� Set�� ����
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(87); // �ڵ� �ڽ�
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);
		
		int minScore = set.first();
		System.out.println("�ּ� ���� : " + minScore);
		
		int maxScore = set.last();
		System.out.println("�ִ� ���� : " + maxScore);
		System.out.println("---------------------------------------");
		// �����˻�
		Set<Integer> set2 = set.subSet(80, true, 90, false);
		for(int score : set2){
			System.out.println(score);
		}
		System.out.println("---------------------------------------");
		// ����(��������)
		Set<Integer> set3 = set.descendingSet();
		for(int score : set3){
			System.out.print(score + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		// ����(��������)
		Set<Integer> set4 = set.descendingSet().descendingSet();
		for(int score : set4){
			System.out.print(score + " ");
		}
		
	}
}
