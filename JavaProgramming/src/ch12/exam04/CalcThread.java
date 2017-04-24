package ch12.exam04;

public class CalcThread extends Thread{
	public CalcThread(String threadName) {
		super(threadName);
	}
	public void run(){
		for(int i = 0 ; i < 2000000000 ; i++){
			
		}
		System.out.println(getName());
	}
	
}
