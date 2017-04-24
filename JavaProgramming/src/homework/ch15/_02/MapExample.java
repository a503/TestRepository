package homework.ch15._02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> set = map.keySet();
		for(String key : set){
			if(map.get(key) >= maxScore){
				maxScore = map.get(key);
			}
			totalScore += map.get(key);
			if(maxScore == map.get(key)){
				name = key;
			}
		}
		double avg = (double) totalScore/map.size();
		System.out.println("평균점수 : " + (int)avg);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
	}
}
