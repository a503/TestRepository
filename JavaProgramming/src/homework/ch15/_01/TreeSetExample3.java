package homework.ch15._01;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		// ���� �˻�
		System.out.println("[c~f ������ �ܾ� �˻�]");
		Set<String> set = treeSet.subSet("c", true, "f", true);
		for(String cf : set){
			System.out.println(cf);
		}
	}
}
