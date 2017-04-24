package ch07.exam07.homework07_1._14;

public class InstanceofExample {
	public static void method1(Parent parent){
		if(parent instanceof Child){ // Parent 타입의 매개변수가 Child 타입으로 변환으로 가능한지 확인한다. 가능하면 true, 불가능하면 false 반환
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		}else{
			System.out.println("method1 - Child로 변환 실패");
		}	
	}
	public static void method2(Parent parent){
		Child child = (Child)parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		
		method1(parentB);
		method2(parentB); // 예외 발생, 무조건으로 타입변환을 하는 경우 규칙에 맞이 않으면 예외 발생

	}

}
