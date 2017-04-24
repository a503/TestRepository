package homework.ch15._01;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "�ڱ��");
		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");
		String s1 = new String("ȫ");
		String s2 = new String("ȫ");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Map.Entry<Integer, String> entry = scores.firstEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		entry = scores.lastEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		
		entry = scores.lowerEntry(95);
		System.out.println("95�� �Ʒ� ����: " + entry.getKey() + "-" + entry.getValue());
		entry = scores.higherEntry(95);
		System.out.println("95�� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		
		entry = scores.floorEntry(95);
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + entry.getKey() + "-" + entry.getValue());
		entry = scores.ceilingEntry(85);
		System.out.println("95�� �̰ų� �ٷ� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		System.out.println();
		
		while(!scores.isEmpty()){
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(���� ��ü �� : " + scores.size() + ")");
		}
	}
}
