package homework.ch15._01;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		// 내림차순 정렬자를 TreeSet의 매개값으로 지정
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()){
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName() + " : " + fruit.getPrice());
		}
	}
}
