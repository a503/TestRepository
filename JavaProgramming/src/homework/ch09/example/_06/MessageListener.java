package homework.ch09.example._06;

public class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
