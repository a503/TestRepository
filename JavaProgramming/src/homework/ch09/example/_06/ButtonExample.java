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
				System.out.println("��ȭ�� �̴ϴ�.");
			}
		});
		btn1.touch();
		
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
			}
		});
		btn1.touch();
		
	}

}
