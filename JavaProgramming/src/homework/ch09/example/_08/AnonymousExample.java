package homework.ch09.example._08;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV�� ���ϴ�.");
			}
		});
		
		anony.method2(anony.field);
	}

}
