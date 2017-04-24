package ch06.homework03.check;

public class Printer {
	/*
	private int f1;
	private boolean f2;
	private double f3;
	private String f4;
	
	public void setF1(int f1) {
		this.f1 = f1;
		println(this.f1);
	}
	public void setF2(boolean f2) {
		this.f2 = f2;
		println(this.f2);
	}
	public void setF3(double f3) {
		this.f3 = f3;
		println(this.f3);
	}
	public void setF4(String f4) {
		this.f4 = f4;
		println(this.f4);
	}
	private void println(int f1){
		System.out.println(this.f1);
	}
	private void println(boolean f2){
		System.out.println(this.f2);
	}
	private void println(double f3){
		System.out.println(this.f3);
	}
	private void println(String f4){
		System.out.println(this.f4);
	}
	*/
	
	//Singleton
	private static Printer printer = new Printer();
	
	private Printer(){}
	
	static Printer getInstance(){
		return printer;
	}
	void println(int f1){
		System.out.println(f1);
	}
	void println(boolean f2){
		System.out.println(f2);
	}
	void println(double f3){
		System.out.println(f3);
	}
	void println(String f4){
		System.out.println(f4);
	}
	
	
}
