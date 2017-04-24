package homework.ch15._01;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		//Set에는 검색관련 메소드가 없기 때문에 TreeSet타입으로 사용
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(87); // 자동 박싱
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);
		
		int score = set.first();
		System.out.println("가장 낮은 점수 : " + score);
		score = set.last();
		System.out.println("가장 높은 점수 : " + score);
		System.out.println();
		
		score = set.lower(95);
		System.out.println("95점 아래 점수 : " + score);
		score = set.higher(95);
		System.out.println("95점 위의 점수 : " + score);
		System.out.println();
		
		score = set.floor(95);
		System.out.println("95점 이거나 바로 아래 점수 : " + score);
		score = set.ceiling(85);
		System.out.println("85점 이거나 바로 위의 점수 : " + score);
		
		while(!set.isEmpty()){
			score = set.pollFirst(); // 가장 낮은 값을 리턴하고, 컬렉션에서 제거
			System.out.println(score + "(남은 객체 수 : " + set.size() +")");
		}
		
		
				
	}
}
