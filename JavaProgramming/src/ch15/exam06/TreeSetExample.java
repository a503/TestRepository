package ch15.exam06;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//Set<Integer> set = new TreeSet<>(); // 검색과 관련된 메소드는 Set에 없다
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(87); // 자동 박싱
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);
		
		int minScore = set.first();
		System.out.println("최소 점수 : " + minScore);
		
		int maxScore = set.last();
		System.out.println("최대 점수 : " + maxScore);
		System.out.println("---------------------------------------");
		// 범위검색
		Set<Integer> set2 = set.subSet(80, true, 90, false);
		for(int score : set2){
			System.out.println(score);
		}
		System.out.println("---------------------------------------");
		// 정렬(내림차순)
		Set<Integer> set3 = set.descendingSet();
		for(int score : set3){
			System.out.print(score + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		// 정렬(오름차순)
		Set<Integer> set4 = set.descendingSet().descendingSet();
		for(int score : set4){
			System.out.print(score + " ");
		}
		
	}
}
