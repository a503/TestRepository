package ch06.exam12;

public class BoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		
		board.setBno(1);
		board.setTitle("�� ���� �����̾�");
		board.setContent("��ī��");
		board.setWriter("����");
		board.setOpen(false);
		
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.isOpen());
	}

}
