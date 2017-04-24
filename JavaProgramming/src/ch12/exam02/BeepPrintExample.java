package ch12.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		//�Ҹ��� ���� �ڵ�
		/*BeepThread beepThread = new BeepThread();
		beepThread.start();*/
		
		Thread thread = new Thread(){
			@Override
			public void run() {
				//�Ҹ��� ���� �ڵ�
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // new�� toolkit�� �����ϸ� �ü���� �´� �ڵ尡 �ʿ��ϴ�.
				for(int i = 0 ; i < 5 ; i ++){
					toolkit.beep();
					try {
						Thread.sleep(500);
						// �����尡 ��� �����(���⼭�� ���ν�����)
					} catch (InterruptedException e) {}
				}
			}
		};
		thread.start();
		
		for(int i = 0 ; i < 5 ; i ++){
			System.out.println("beep()");
			try {
				Thread.sleep(500);
				// �����尡 ��� �����(���⼭�� ���ν�����)
			} catch (InterruptedException e) {}
		}
		
		
	}

}
