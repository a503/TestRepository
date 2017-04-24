package homework.ch15._01;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		// 내림차순
		Map<Integer, String> map = scores.descendingMap();
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet(); // map을 set으로 변환해 한번에 출력하기 편하게 만들었다
		for(Map.Entry<Integer, String> entry : entrySet){
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		System.out.println();
		
		// 오름차순
		Map<Integer, String> map1 = scores.descendingMap().descendingMap();
		entrySet = map1.entrySet();
		for(Map.Entry<Integer, String> entry : entrySet){
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
	}
}
