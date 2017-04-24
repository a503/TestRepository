package homework.ch09.example._08;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		//TV
		@Override
		public void turnOn() {
			System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV¸¦ ²ü´Ï´Ù.");
		}
	};
	
	void method1(){
		RemoteControl localVariable = new RemoteControl() {
			//Audio
			@Override
			public void turnOn() {
				System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio¸¦ ²ü´Ï´Ù.");
			}
		};
		localVariable.turnOn();
		localVariable.turnOff();
	}
	
	void method2(RemoteControl remoteControl){
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
}
