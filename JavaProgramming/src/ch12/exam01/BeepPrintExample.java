package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		/*//�Ҹ��� ���� �ڵ�
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // new�� toolkit�� �����ϸ� �ü���� �´� �ڵ尡 �ʿ��ϴ�.
		for(int i = 0 ; i < 5 ; i ++){
			toolkit.beep();
			try {
				Thread.sleep(500);
				// �����尡 ��� �����(���⼭�� ���ν�����)
			} catch (InterruptedException e) {}
		}*/
		// Print
		
		// Thread execution
		//BeepTask beepTask = new BeepTask();
		//Runnable beepTask = new BeepTask(); // �͸� ��ü �׽�Ʈ�� ���� �ּ�
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				//�Ҹ��� ���� �ڵ�
				System.out.println(Thread.currentThread().getName());
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // new�� toolkit�� �����ϸ� �ü���� �´� �ڵ尡 �ʿ��ϴ�.
				for(int i = 0 ; i < 5 ; i ++){
					toolkit.beep();
					try {
						Thread.sleep(500);
						// �����尡 ��� �����(���⼭�� ���ν�����)
					} catch (InterruptedException e) {}
				}
			}
		});
		System.out.println(Thread.currentThread().getName());
		thread.start(); // �۾������尡 ����Ǵ� ����
		
		for(int i = 0 ; i < 5 ; i ++){
			System.out.println("beep()");
			try {
				Thread.sleep(500);
				// �����尡 ��� �����(���⼭�� ���ν�����)
			} catch (InterruptedException e) {}
		}
		
		
	}

}
