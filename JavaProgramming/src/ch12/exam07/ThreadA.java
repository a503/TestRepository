package ch12.exam07;

public class ThreadA extends Thread{
	private boolean stop = false; // Thread�� �����ϱ� ���� ����
	private boolean work = true; // Thread �۾��� �纸�� ����
	
	@Override
	public void run() {
		while(!stop){
			if(work){
				System.out.println("ThreadA Working...");
			}else{
				yield();
			}
		}
		System.out.println("==ThreadA Terminated==");
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void setWork(boolean work) {
		this.work = work;
	}
}
