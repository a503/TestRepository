package homework.ch12;

public class ThreadExample2 {
	public static void main(String[] args) {
		Thread thread = new MovieThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		thread.interrupt();
	}
}
