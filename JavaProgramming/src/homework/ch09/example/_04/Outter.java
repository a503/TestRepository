package homework.ch09.example._04;

public class Outter {
	//자바 7 이전
	public void method1(final int arg){
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		//final 선언으로 인해 모두 값변경 불가.
		class Inner{
			public void method(){
				int result = arg + localVariable;
			}
		}
	}
	//자바 8 이후
	public void method2(int arg){
		int localVariable = 2;
		//arg = 100;
		//localVariable = 100;
		// 로컬 클래스에서 메소드 내부의 매개변수, 지역변수를 사용시 자바8 이후부터는 명시하지 않아도 final처리된다
		
		class Inner{
			public void method(){
				//arg = 1;
				
				int result = arg + localVariable;
			}
		}
	}
}
/*
 * 이렇게 로컬 클래스에서 메소드의 매개변수, 로컬 변수를 사용할때 final 처리 되는 이유는 생존시점의 차이 때문이다
 * 매개변수와, 로컬변수는 method가 끝나는 시점에서 스택메모리에서 삭제된다, 하지만 로컬클래스는 메소드 실행이 끝나도 힙 메모리에 존재해서 계속 사용할 수 있다.
 * 이런 경우 매개변수와, 로컬변수가 사라진다면 로컬 객체에서 사용한 변수들이 문제가된다.
 * 여기서 이 문제를 해결하기 위해 컴파일 시 로컬 클래스에서 사용하는 매개 변수나 로컬 변수의 값을 로컬 클래스 내부에 그대로 복사하는데 이때 매개변수나 로컬 변수가
 * 수정되어 값이 변경되면 로컬 클래스에 복사해 둔 값과 달라지는 문제를 해결하기 위해 final 선언을 해 수정을 막는다.
 * 자바8부터는 final키워드를 붙이지 않아도 자동적으로 final 취급을 한다.
 * 하지만 final이 붙을경우 로컬 클래스의 메소드 내부에 변수로 복사되고, final을 붙이지 않을 경우 로컬 클래스의 필드로 복사된다.
 */