package ch12.exam10;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 thread = new PrintThread1();
		thread.start();
		
		//how1
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		thread.setStop(true);
		
	}
	

}
