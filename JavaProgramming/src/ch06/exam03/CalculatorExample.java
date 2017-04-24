package ch06.exam03;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.powerOn(); // 메소드 호출
		
		String info = calc.info();
		System.out.println(info);
		
		int resultPlus = calc.plus(10, 20);
		System.out.println(resultPlus);
		
		double resultDoublePlus = calc.plus(10.5, 20.7);
		System.out.println(resultDoublePlus);
		
		double resultDivide = calc.divide(10.5, 5.2);
		System.out.println(resultDivide);
		
		int[] resultArray = calc.changeArray(10, 20, 30);
		for(int value : resultArray){
			System.out.print(value + " ");
		}
		System.out.println();
		
		Car resultCar = calc.makeCar("Black", true); // return 값의 타입이 객체일때, 이런경우 앞으로 많다.
		System.out.println(resultCar.color);
		System.out.println(resultCar.airback);
		
	}

}
