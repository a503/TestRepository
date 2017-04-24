package ch08.homework01;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // <- InterfaceA변수이므로 methodA()만 호출가능
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB(); // <- InterfaceB변수이므로 methodB()만 호출가능
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		

	}

}
