package ch07.exam07.homework07_1._6;

public class SportCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	/* �θ��� �޼ҵ尡 final�� ����Ǿ��ֱ� ������ �޼ҵ带 �������̵� �� �� ����.
	 * final method�� �� �̻� ������ ���� ���ϰ� �Ѵ�.
	@Override
	public void stop(){
		System.out.println("������ī�� ����");
		speed = 0;
	}
	*/
}
