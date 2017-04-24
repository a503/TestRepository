package ch14.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// ���ٽ� ���
		Thread thread = new Thread(()->{
			//�Ҹ��� ���� �ڵ�
			System.out.println(Thread.currentThread().getName());
			Toolkit toolkit = Toolkit.getDefaultToolkit(); // new�� toolkit�� �����ϸ� �ü���� �´� �ڵ尡 �ʿ��ϴ�.
			for(int i = 0 ; i < 5 ; i ++){
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
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
