package ch11.exam13;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		/*
		String[] names = {"홍길동", "김민수", "박동수"};
		
		System.out.println(Arrays.toString(names));
		
		//올림차순
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		*/
		// 객체배열의 sort ->입사문제로 나온적이있다.
		Member[] members = {
				new Member("홍길동", 20),
				new Member("김민수", 15),
				new Member("박동수", 25)
		}; // 멤버 객채를 이름순(올림차)으로 정렬하시오.
		/*
		System.out.println(Arrays.toString(members));
		//올림차순
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		
		//내림차순
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));
		*/
		//나이 기준 올림차순
		System.out.println(Arrays.toString(members));
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		
		//나이 기준 내림차순
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));	
	}

}
