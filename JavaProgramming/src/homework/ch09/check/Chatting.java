package homework.ch09.check;

public class Chatting {
	void startChat(String chatId){
		//String nickName = null;
		//nickName = chatId;
		String nickName = chatId;
		
		Chat chat = new Chat(){
			@Override
			void start() {
				while(true){
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData; // 메소드 내부에서 Chat클래스를 상속한 자식 클래스를 선언하고 new연산자로 선언된 자식클래스의 객체를 만들었다
					sendMessage(message);								// 이렇게 로컬 클래스에서 지역변수나, 매개변수를 사용(nickName)하게 되면 final선언이 되 더이상 값 변경이 불가능하다 
				}														// 라인 5에서 nickName은 null로 초기화 되었다 그런데 라인 6에서 다시 초기화 하고 있다 이런 상태에서 로컬클래스내부에서 nickName
			}															// 을 사용하면 final처리된 지역변수가 다시 초기화되는 코드가 있으므로 컴파일 에러 발생
		};
		chat.start();
	}
	class Chat{
		void start(){}
		void sendMessage(String message){}
	}
}
