package ch12.exam10;

public class PrintThread2 extends Thread {
	//Field
	//Constructor
	//Method
//	@Override
//	public void run() {
//		try{
//			while(true){
//				System.out.println("���� ��...");
//				System.out.println("���� ��...");
//				Thread.sleep(1);
//			}
//		}catch(InterruptedException e){
//			System.out.println("�ڿ� ����");
//			System.out.println("���� ����");
//		}
//	}
	@Override
	public void run() {
		while(true){
			System.out.println("���� ��...");
			System.out.println("���� ��...");
			if(isInterrupted()){
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
