package homework.ch15._01;

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

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
