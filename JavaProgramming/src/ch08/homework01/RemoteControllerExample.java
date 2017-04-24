package ch08.homework01;

public class RemoteControllerExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		//rc = new Audio();
		
		//rc에 어떤 객체가 들어가느냐에 따라 다른 결과가 나온다.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		

	}

}
