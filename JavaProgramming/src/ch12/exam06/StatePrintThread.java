package ch12.exam06;

public class StatePrintThread extends Thread {	
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			int nano = 1;
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: " + state);
			if(state == Thread.State.RUNNABLE){
				System.out.println("Ÿ�� ������ ����: " + "RUNNING");
			}
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5�ʰ� �Ͻ� ����
				Thread.sleep(100);
			} catch(Exception e) {}
		}
	}
}

