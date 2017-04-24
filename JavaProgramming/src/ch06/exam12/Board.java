package ch06.exam12;

public class Board {
	//Field
	private int bno; // board number;
	private String title;
	private String content;
	private String writer;
	private boolean open;
	//Constructor
	//Method
	public int getBno(){
		return this.bno;
	}
	public String getTitle(){
		return this.title;
	}
	public String getContent() {
		return this.content;
	}
	public String getWriter() {
		return this.writer;
	}
	public boolean isOpen(){
		return this.open;
	}
	public void setBno(int bno) {
		if(bno < 0) bno = 0;
		this.bno = bno;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setOpen(boolean open){
		this.open = open;
	}
	
}
