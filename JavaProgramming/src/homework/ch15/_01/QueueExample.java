package homework.ch15._01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		// 큐는 인터페이스이고 링크드리스트가 큐인터페이스를 구현하고 있다.
		Queue<Message> messageQueue = new LinkedList<>(); 
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()){
			Message message = messageQueue.poll();
			switch(message.getCommand()){
			case "sendMail":
				System.out.println(message.getTo() + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.getTo() + "님에게 카카오톡을 보냅니다.");
				break;
				
			}
		}
	}
}
