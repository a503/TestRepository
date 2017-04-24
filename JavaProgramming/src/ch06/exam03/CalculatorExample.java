package ch06.exam03;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.powerOn(); // �޼ҵ� ȣ��
		
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
		
		Car resultCar = calc.makeCar("Black", true); // return ���� Ÿ���� ��ü�϶�, �̷���� ������ ����.
		System.out.println(resultCar.color);
		System.out.println(resultCar.airback);
		
	}

}
