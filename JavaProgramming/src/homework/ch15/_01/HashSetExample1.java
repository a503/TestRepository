package homework.ch15._01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java"); // HashSet�� ��ü�� �߰�, ������ ����
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size(); // ��ü�� ��
		System.out.println("�� ��ü�� : " + size);
		
		// Set�� �����ڰ� ���� ���� ����ϴ� �޼ҵ尡 ����.
		Iterator<String> iterator = set.iterator(); // HashSet�� �׸��� ����ϱ� ���� ��ü Set�� Iterator(�ݺ���)�� ��´�.
		while(iterator.hasNext()){ // Set�� ���� �׸� ����ŭ �����Ѵ�.
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		size = set.size();
		System.out.println("�� ��ü�� : " + size);
		
		iterator = set.iterator(); // set�� ��ȭ��Ų�� �ٽ� �ݺ��� ��� �� ���
		while(iterator.hasNext()){
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.clear();
		if(set.isEmpty()){
			System.out.println("��� ����");
		}
	}

}
