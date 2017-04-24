package homework.ch15._01;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "ȫ�浿");
		scores.put(98, "�̵���");
		scores.put(75, "�ڱ��");
		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");
		// ��������
		Map<Integer, String> map = scores.descendingMap();
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet(); // map�� set���� ��ȯ�� �ѹ��� ����ϱ� ���ϰ� �������
		for(Map.Entry<Integer, String> entry : entrySet){
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		System.out.println();
		
		// ��������
		Map<Integer, String> map1 = scores.descendingMap().descendingMap();
		entrySet = map1.entrySet();
		for(Map.Entry<Integer, String> entry : entrySet){
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
	}
}
