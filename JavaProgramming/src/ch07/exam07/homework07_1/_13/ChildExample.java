package ch07.exam07.homework07_1._13;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 형변환
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * field2 와 method3()는 Child 타입에만 선언되어 있으므로
		 * Parent 타입으로 자동 타입 변환하면 사용할 수 없다.
		parent.field2 = "data2";
		parent.method3();
		*/
		
		// Child로 강제로 형변환해서 field2와 method3 사용
		// 이런식으로는 거의 사용하지 않는다.
		Child child = (Child)parent;
		child.field2 = "data2";
		child.method3();
	}

}
