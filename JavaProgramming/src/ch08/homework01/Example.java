package ch08.homework01;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); // <- InterfaceA�����̹Ƿ� methodA()�� ȣ�Ⱑ��
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB(); // <- InterfaceB�����̹Ƿ� methodB()�� ȣ�Ⱑ��
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		

	}

}
