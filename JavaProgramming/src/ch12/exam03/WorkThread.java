package ch12.exam03;

public class WorkThread extends Thread{
	public WorkThread(String threadName) {
		// ������ �̸� ����
		//super(threadName);
		setName(threadName); // ������ �̸��� �����Ҷ��� ������ �������� �̸��� �������־�� �Ѵ�.
	}
	@Override
	public void run() {
		//String threadName = Thread.currentThread().getName();
		String threadName = getName();
		for(int i = 0 ; i < 2 ; i ++){
			System.out.println(threadName + "�� ����� ����...");
		}
	}
}
