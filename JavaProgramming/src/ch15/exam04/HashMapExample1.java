package ch15.exam04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 동등이기 때문에 이 값으로 대체 된다.
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		//keySet 사용, set에 key만을 받는다.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()){
			String key = keyIterator.next();
			//Integer value = map.get(key);
			int value = map.get(key); // 자동 언박싱
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		//entrySet사용, entry를 set에 담는다
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
			System.out.println("총 Entry 수 : " + map.size());
		}else
			System.out.println("총 Entry 수 : " + map.size());
	}
}
