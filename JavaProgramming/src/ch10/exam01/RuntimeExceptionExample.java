package ch10.exam01;

import java.io.IOException;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		// NullPointerException
		// String str = null;
		// System.out.println(str.length()); 
		
		// ArrayIndexOutOfBoundsException
		// String[] arr = {"a", "b"};
		// String data1 = arr[2]; 
		
		// String data1 = args[0]; 메인의 매개값이 정해지지 않았을때
		
		// NumberFormatException
		// int num = Integer.parseInt("100");  // O
		// int num1 = Integer.parseInt("a100"); // 예외 발생
		
		// ClassCastException // casting 실패
		// Animal animal = new Dog();
		// Dog dog = (Dog) animal; // 가능
		
		// Cat cat = (Cat) animal; // 예외 발생
		
		// 일반 예외
		// int keycode = System.in.read();
		
		
	}

}
