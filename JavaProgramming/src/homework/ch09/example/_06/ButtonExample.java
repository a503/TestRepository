package homework.ch09.example._06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		System.out.println("=============================================");
		
		Button btn1 = new Button();
		
		btn1.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick() {
				System.out.println("전화를 겁니다.");
			}
		});
		btn1.touch();
		
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
		btn1.touch();
		
	}

}
