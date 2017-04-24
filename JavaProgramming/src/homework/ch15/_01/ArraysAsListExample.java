package homework.ch15._01;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Hong", "Shin", "Kam");
		for(String name : list1){
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2){
			System.out.println(value);
		}
		//list2.add(4); asList로 List를 생성하면 배열처럼 크기가 고정된다.
		for(int value : list2){
			System.out.println(value);
		}
		
	}
}
