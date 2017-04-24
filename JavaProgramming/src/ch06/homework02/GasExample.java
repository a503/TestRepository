package ch06.homework02;

public class GasExample {

	public static void main(String[] args) {
		Gas myCar = new Gas();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState){
			System.out.println("출발 합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()){
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else{
			System.out.println("gas를 주입하세요.");
		}

	}

}
