package homework.ch09.example._08;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		//TV
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1(){
		RemoteControl localVariable = new RemoteControl() {
			//Audio
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
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
