package ch11.exam14;

public class WrapperExample {

	public static void main(String[] args) {
			int v1 = 10;
			
			Integer v2 = 10; // Auto-Boxing
			int v3 = v2; //Auto-unBoxing
			method1(10); //Auto-Boxing
			int v4 = method2();//Auto-unBoxing
			
			String v7 = String.valueOf(v3);
			
		
	}
	public static void method1(Object obj){
		System.out.println(obj);
	
	}
	public static Integer method2(){
		return 1;
	}
}
