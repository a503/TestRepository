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
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "] " + inputData; // �޼ҵ� ���ο��� ChatŬ������ ����� �ڽ� Ŭ������ �����ϰ� new�����ڷ� ����� �ڽ�Ŭ������ ��ü�� �������
					sendMessage(message);								// �̷��� ���� Ŭ�������� ����������, �Ű������� ���(nickName)�ϰ� �Ǹ� final������ �� ���̻� �� ������ �Ұ����ϴ� 
				}														// ���� 5���� nickName�� null�� �ʱ�ȭ �Ǿ��� �׷��� ���� 6���� �ٽ� �ʱ�ȭ �ϰ� �ִ� �̷� ���¿��� ����Ŭ�������ο��� nickName
			}															// �� ����ϸ� finaló���� ���������� �ٽ� �ʱ�ȭ�Ǵ� �ڵ尡 �����Ƿ� ������ ���� �߻�
		};
		chat.start();
	}
	class Chat{
		void start(){}
		void sendMessage(String message){}
	}
}
