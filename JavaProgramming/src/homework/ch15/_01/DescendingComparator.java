package homework.ch15._01;

import java.util.Comparator;

// 정렬자 생성
public class DescendingComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return Integer.compare(o2.getPrice(), o1.getPrice());
		//return Integer.compare(o1.getPrice(), o2.getPrice());
	}
	
}
