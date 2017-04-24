package ch06.homework03.check;

public class PrinterExample {

	public static void main(String[] args) {
		
		//Printer printer = new Printer();
		/*
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		*//*
		printer.setF1(10);
		printer.setF2(true);
		printer.setF3(5.7);
		printer.setF4("ȫ�浿");
		*/
		Printer printer = Printer.getInstance();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
	}

}
