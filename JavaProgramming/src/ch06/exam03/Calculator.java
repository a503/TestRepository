package ch06.exam03;

public class Calculator {
	//Field
	boolean power;
	//Constructor
	
	//Method
	void powerOn(){
		System.out.println("power on");
		power = true;
	}
	void powerOff(){
		System.out.println("Power off");
		power = false;
	}
	String info(){
		return "�Ｚ����-2017-03-28";
	}
	int plus(int x, int y){
		int result = x + y;
		return result;
	}
	double plus(double x, double y){
		double result = x + y;
		return result;
	}
	double divide(double x, double y){
		double result = x / y;
		return result;
	}
	int[] changeArray(int x, int y, int z){
		int[] array = {x, y, z};
		return array;
	}
	Car makeCar(String color, boolean airback){ // Car��� Ŭ������ ��� �����ؾ� �ұ �˷���� �Ѵ�.
		Car car = new Car(color, airback);
		return car;
	}
}
