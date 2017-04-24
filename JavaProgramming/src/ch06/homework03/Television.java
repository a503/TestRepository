package ch06.homework03;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static{ // static field를 복잡한 연산에서 사용할때 static block 사용
		info = company + "-" + model;
	} // static block 에서는 instance field를 접근하면 컴파일 에러 발생
}
