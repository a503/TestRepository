package ch06.exam12;

public class BoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		
		board.setBno(1);
		board.setTitle("자 이제 시작이야");
		board.setContent("피카츄");
		board.setWriter("지우");
		board.setOpen(false);
		
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.isOpen());
	}

}
