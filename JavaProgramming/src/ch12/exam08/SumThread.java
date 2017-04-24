package ch12.exam08;

public class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}

	@Override
	public void run() {
		for(long i = 1 ; i <= 1000000000 ; i++){
			sum+=i;
		}
	}
}
