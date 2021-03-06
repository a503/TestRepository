package ch12.exam07;

public class ThreadB extends Thread{
	private boolean stop = false; // Thread를 종료하기 위한 목적
	private boolean work = true; // Thread 작업을 양보할 목적
	
	@Override
	public void run() {
		while(!stop){
			if(work){
				System.out.println("ThreadB Working...");
			}else{
				yield();
			}
		}
		System.out.println("==ThreadB Terminated==");
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void setWork(boolean work) {
		this.work = work;
	}
}
