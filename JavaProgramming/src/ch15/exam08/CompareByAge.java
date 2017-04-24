package ch15.exam08;

import java.util.Comparator;

public class CompareByAge implements Comparator<Person>{
	// Person의 나이를 가지고 비교하는 비교자
	@Override
	public int compare(Person o1, Person o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
