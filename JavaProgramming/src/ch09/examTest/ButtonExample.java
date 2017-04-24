package ch09.examTest;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(btn.new OnClickListener(){
			@Override
			void onClick() {
				System.out.println("서버에 접속합니다.");
			}
		});
		btn.touch();
	}

}
