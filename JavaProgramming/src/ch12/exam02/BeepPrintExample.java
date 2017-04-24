package ch12.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		//소리를 내는 코드
		/*BeepThread beepThread = new BeepThread();
		beepThread.start();*/
		
		Thread thread = new Thread(){
			@Override
			public void run() {
				//소리를 내는 코드
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // new로 toolkit을 생성하면 운영체제에 맞는 코드가 필요하다.
				for(int i = 0 ; i < 5 ; i ++){
					toolkit.beep();
					try {
						Thread.sleep(500);
						// 쓰레드가 잠시 쉬어라(여기서는 메인스레드)
					} catch (InterruptedException e) {}
				}
			}
		};
		thread.start();
		
		for(int i = 0 ; i < 5 ; i ++){
			System.out.println("beep()");
			try {
				Thread.sleep(500);
				// 쓰레드가 잠시 쉬어라(여기서는 메인스레드)
			} catch (InterruptedException e) {}
		}
		
		
	}

}
