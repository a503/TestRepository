package homework.ch15._01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java"); // HashSet에 객체를 추가, 구분자 없음
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size(); // 객체의 수
		System.out.println("총 객체수 : " + size);
		
		// Set은 구분자가 없어 따로 출력하는 메소드가 없다.
		Iterator<String> iterator = set.iterator(); // HashSet의 항목을 사용하기 위해 전체 Set을 Iterator(반복자)로 얻는다.
		while(iterator.hasNext()){ // Set이 가진 항목 수만큼 루핑한다.
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		size = set.size();
		System.out.println("총 객체수 : " + size);
		
		iterator = set.iterator(); // set을 변화시킨후 다시 반복자 얻어 값 출력
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.clear();
		if(set.isEmpty()){
			System.out.println("비어 있음");
		}
	}

}
