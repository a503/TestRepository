package homework.ch12;

public class MovieThread2 extends Thread {
	@Override
	public void run() {
		while(true){
			System.out.println("�������� ����մϴ�.");
			if(isInterrupted()){
				System.out.println("���ͷ�Ʈ �߻� �����带 �����մϴ�!!!");
				break;
			}
		}
	}
}
