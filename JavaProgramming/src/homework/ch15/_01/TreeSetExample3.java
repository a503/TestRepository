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
		
		// 범위 검색
		System.out.println("[c~f 사이의 단어 검색]");
		Set<String> set = treeSet.subSet("c", true, "f", true);
		for(String cf : set){
			System.out.println(cf);
		}
	}
}
