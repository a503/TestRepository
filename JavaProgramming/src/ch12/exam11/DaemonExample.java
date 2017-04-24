package ch12.exam11;

public class DaemonExample {

	public static void main(String[] args) {
		System.out.println("워드 프로세스를 시작함");
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // 보조 스레드로 만드는 코드, 주 스레드가 죽으면 함께죽는다.
		autoSaveThread.start();
		
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		System.out.println("워드 프로세스를 종료함");
	}
	

}
