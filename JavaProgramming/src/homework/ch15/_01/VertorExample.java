package homework.ch15._01;

import java.util.List;
import java.util.Vector;

public class VertorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		// List에 Board의 객체를 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3); // 앞 코드에서 하나가 삭제되면서 뒤의 인덱스가 하나씩 당겨지기 때문에 여기서는 제목5가 삭제된다.
		
		
		for(int i=0 ; i < list.size() ; i++){
			Board board = list.get(i); // list에서 인덱스로 가지고 항목을 하나씩 빼온다.
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		System.out.println();
		//향상 for문으로 사용
		for(Board board : list){
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
