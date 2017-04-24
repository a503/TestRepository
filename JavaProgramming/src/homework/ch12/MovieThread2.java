package homework.ch12;

public class MovieThread2 extends Thread {
	@Override
	public void run() {
		while(true){
			System.out.println("동영상을 재생합니다.");
			if(isInterrupted()){
				System.out.println("인터럽트 발생 스레드를 종료합니다!!!");
				break;
			}
		}
	}
}
