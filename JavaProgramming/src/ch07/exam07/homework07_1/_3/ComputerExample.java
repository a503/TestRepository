package ch07.exam07.homework07_1._3;

public class ComputerExample {
	// int r = 10; main메소드가 있는 클래스에도 클래스멤버 사용가능
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calc = new Calculator(); // 부모의 객체 생성
		System.out.println("원면적 : " + calc.areaCircle(r)); //부모의 메소드 이다. 부모의 객체만 생성했기때문에 자식은 아직 객체조차 없다.
		System.out.println();
		
		Computer calcComputer = new Computer();
		System.out.println("원면적 : " + calcComputer.areaCircle(r)); //자식의 재정의된 메소드이다. 메소드가 오버라이딩되면 부모의 메소드는 가려진다.
		System.out.println();
		
		System.out.println("원면적 : " + calcComputer.superAreaCircle(r)); // 자식에서 오버라이딩된 부모의 메소드에 접근하는 메소드를 정의하여 가려진 부모메소드를 사용
	}

}
