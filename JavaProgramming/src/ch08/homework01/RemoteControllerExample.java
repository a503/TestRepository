package ch08.homework01;

public class RemoteControllerExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		//rc = new Audio();
		
		//rc�� � ��ü�� �����Ŀ� ���� �ٸ� ����� ���´�.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		

	}

}
