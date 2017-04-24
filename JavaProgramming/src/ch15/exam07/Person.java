package ch15.exam07;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Person p) {
		/*if(this.age < p.getAge()){
			return -1;
		}else if(this.age == p.getAge()){
			return 0;
		}else{
			return 1;
		}*/
		return Integer.compare(this.age, p.getAge()); // 오름차
		//return Integer.compare(p.getAge(), this.age); // 내림차
	}
}
