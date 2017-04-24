package ch11.exam03;

public class Member {
	// Field
	private String id;
	// Constructor
	Member(String id){
		this.id = id;
	}
	@Override
	public String toString() {
		return this.id;
	}
}
