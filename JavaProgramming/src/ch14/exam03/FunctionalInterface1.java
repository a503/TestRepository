package ch14.exam03;

@FunctionalInterface // 컴파일러는 이 인터페이스가 람다식으로 구현객체를 만들수 있는지 검사한다. -> 추상메소드가 한개 인지.
public interface FunctionalInterface1 {
	public void method();
	// public void method2(); 에러발생 람다식으로 사용할 인터페이스 이기 때문에
}
