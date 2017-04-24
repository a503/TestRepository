package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("s1");
		students[1] = new Student("s2");
		students[2] = new Student("s3");
		//students[3] = new Student("s4"); // 배열의 크기보다 많은 데이터를 저장, 에러발생
		students[1] = null;
		
		List<Student> list = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i ++){
			list.add(new Student("s" + (i+1) ));
		}
		list.remove(1); // 항목이 지워지면 null이 들어가는게 아니라 해당 인덱스의 뒷부분이 앞으로 당겨진다 -> 빈공간이 없다
	}
}
