package ch12.exam03;

public class WorkThread extends Thread{
	public WorkThread(String threadName) {
		// 스레드 이름 설정
		//super(threadName);
		setName(threadName); // 스레드 이름을 설정할때는 스레드 실행전에 이름을 지정해주어야 한다.
	}
	@Override
	public void run() {
		//String threadName = Thread.currentThread().getName();
		String threadName = getName();
		for(int i = 0 ; i < 2 ; i ++){
			System.out.println(threadName + "이 출력한 내용...");
		}
	}
}
