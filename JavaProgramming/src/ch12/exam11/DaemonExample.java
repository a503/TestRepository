package ch12.exam11;

public class DaemonExample {

	public static void main(String[] args) {
		System.out.println("���� ���μ����� ������");
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // ���� ������� ����� �ڵ�, �� �����尡 ������ �Բ��״´�.
		autoSaveThread.start();
		
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		System.out.println("���� ���μ����� ������");
	}
	

}
