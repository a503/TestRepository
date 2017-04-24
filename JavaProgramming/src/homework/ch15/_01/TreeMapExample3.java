package homework.ch15._01;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample3 {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 10);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		// ���� �˻�
		System.out.println("[c~f ������ �ܾ� �˻�]");
		Map<String, Integer> subMap = treeMap.subMap("c", true, "f", false);
		for(Map.Entry<String, Integer> entry : subMap.entrySet()){
			System.out.println(entry.getKey() + "-" + entry.getValue() + "������");
		}
	}
}
