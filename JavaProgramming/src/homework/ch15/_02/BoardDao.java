package homework.ch15._02;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> board = new ArrayList<Board>();
		board.add(new Board("����1", "����1"));
		board.add(new Board("����2", "����2"));
		board.add(new Board("����3", "����3"));
		
		return board;
	}
	
}
