package ch07.exam07.homework07_2;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); (x) �߻�Ŭ������ Phone�� �̿��� new �����ڷ� ��ü�� ������ �� ����.
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn(); // ��ӹ��� �޼ҵ�
		smartPhone.internetSearch(); // ����Ʈ�� Ŭ������ �޼ҵ�.
		smartPhone.turnOff(); // ��ӹ��� �޼ҵ�
	}

}
