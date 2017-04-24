package homework.ch15._02;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> board = new ArrayList<Board>();
		board.add(new Board("力格1", "郴侩1"));
		board.add(new Board("力格2", "郴侩2"));
		board.add(new Board("力格3", "郴侩3"));
		
		return board;
	}
	
}
