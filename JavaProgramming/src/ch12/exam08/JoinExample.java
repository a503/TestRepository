package ch12.exam08;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		
		sumThread.start();
		
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			
		}
		
		long result =  sumThread.getSum();
		System.out.println(result);
	}

}
