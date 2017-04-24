package ch07.exam07.homework07_1._11;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	@Override // ����� �޸��ϱ� ���� �������� roll() �޼ҵ�, HankookTire
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation){
			System.out.println(location + " HankookTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}
		else{
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}