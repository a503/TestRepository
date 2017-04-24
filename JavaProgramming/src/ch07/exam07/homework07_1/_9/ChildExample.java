package ch07.exam07.homework07_1._9;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // 자동 타입 변환
		// Child 객체의 주소값을 Child 타입의 child변수에 저장하고 그 값을 Parent 타입의 parent변수에 주소값을 넣어준 형태
		parent.method1();
		parent.method2(); // <- 재정의된 메소드, 메소드가 자식에의해 재정의 되면 부모의 메소드는 가려진다
		
		// parent.method3(); (x) 타입변환된 상태이기 때문에 parent변수로는 child객체의 메소드는 접근할 수 없다.
		// child.method3(); (o) 타입변화되지않은 변수를 사용하면 정상적으로 child객체의 메소드 접근 가능
		
		child.method1(); // 상속받은 부모의 메소드 사용
		child.method2(); // 부모의 메소드를 재정의 하여 사용
		child.method3(); // 자신의 메소드 사용

	}

}
