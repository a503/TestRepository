package homework.ch15._01;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(87);
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);

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
