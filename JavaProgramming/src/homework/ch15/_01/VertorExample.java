package homework.ch15._01;

import java.util.List;
import java.util.Vector;

public class VertorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		// List�� Board�� ��ü�� ����
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
		list.remove(2);
		list.remove(3); // �� �ڵ忡�� �ϳ��� �����Ǹ鼭 ���� �ε����� �ϳ��� ������� ������ ���⼭�� ����5�� �����ȴ�.
		
		
		for(int i=0 ; i < list.size() ; i++){
			Board board = list.get(i); // list���� �ε����� ������ �׸��� �ϳ��� ���´�.
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		System.out.println();
		//��� for������ ���
		for(Board board : list){
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
