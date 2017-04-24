package ch12.exam03;

public class ThreadNameExample {

	public static void main(String[] args) {
		// 실행중인 스레드 이름 확인하기.
		String threadName = Thread.currentThread().getName();
		
		Thread mainThread = Thread.currentThread();
		String threadName1 = mainThread.getName();
		
		// 현재 실행중인 스레드 이름 출력
		System.out.println(threadName + "이 출력한 내용");

		WorkThread wt1 = new WorkThread("wt1");
		wt1.start();
		
		WorkThread wt2 = new WorkThread("wt2");
		wt2.start();
	}

}
