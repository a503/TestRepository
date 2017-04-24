package ch14.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// 람다식 사용
		Thread thread = new Thread(()->{
			//소리를 내는 코드
			System.out.println(Thread.currentThread().getName());
			Toolkit toolkit = Toolkit.getDefaultToolkit(); // new로 toolkit을 생성하면 운영체제에 맞는 코드가 필요하다.
			for(int i = 0 ; i < 5 ; i ++){
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		});

		
		System.out.println(Thread.currentThread().getName());
		thread.start(); // 작업스레드가 실행되는 순간
		
		for(int i = 0 ; i < 5 ; i ++){
			System.out.println("beep()");
			try {
				Thread.sleep(500);
				// 쓰레드가 잠시 쉬어라(여기서는 메인스레드)
			} catch (InterruptedException e) {}
		}
		
		
	}

}
