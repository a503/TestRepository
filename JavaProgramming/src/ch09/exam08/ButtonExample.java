package ch09.exam08;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������ �����մϴ�.");
			}
		});
		btn.touch();
	}

}
