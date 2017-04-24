package homework.ch15._01;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		//Set���� �˻����� �޼ҵ尡 ���� ������ TreeSetŸ������ ���
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(87); // �ڵ� �ڽ�
		set.add(98);
		set.add(75);
		set.add(95);
		set.add(80);
		
		int score = set.first();
		System.out.println("���� ���� ���� : " + score);
		score = set.last();
		System.out.println("���� ���� ���� : " + score);
		System.out.println();
		
		score = set.lower(95);
		System.out.println("95�� �Ʒ� ���� : " + score);
		score = set.higher(95);
		System.out.println("95�� ���� ���� : " + score);
		System.out.println();
		
		score = set.floor(95);
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ���� : " + score);
		score = set.ceiling(85);
		System.out.println("85�� �̰ų� �ٷ� ���� ���� : " + score);
		
		while(!set.isEmpty()){
			score = set.pollFirst(); // ���� ���� ���� �����ϰ�, �÷��ǿ��� ����
			System.out.println(score + "(���� ��ü �� : " + set.size() +")");
		}
		
		
				
	}
}
