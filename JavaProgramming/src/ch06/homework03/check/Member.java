package ch06.homework03.check;

public class Member {
	private String name;
	private final String id;
	private String password;
	private int age;
	
	Member(String name, String id, String password, int age){
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
}
