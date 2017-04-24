package homework.ch12;

public class ThreadExample3 {
	public static void main(String[] args) {
		Thread thread = new MovieThread3();
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}

	}
}
