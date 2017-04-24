package ch15.exam04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95); // �����̱� ������ �� ������ ��ü �ȴ�.
		System.out.println("�� Entry �� : " + map.size());
		
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println();
		
		//keySet ���, set�� key���� �޴´�.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()){
			String key = keyIterator.next();
			//Integer value = map.get(key);
			int value = map.get(key); // �ڵ� ��ڽ�
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());
		
		//entrySet���, entry�� set�� ��´�
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()){
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.clear();
		if(map.isEmpty()){
			System.out.println("�� Entry �� : " + map.size());
		}else
			System.out.println("�� Entry �� : " + map.size());
	}
}
