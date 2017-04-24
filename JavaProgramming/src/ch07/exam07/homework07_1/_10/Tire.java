package ch07.exam07.homework07_1._10;

public class Tire {
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll(){
		++accumulatedRotation; // ���� ȸ���� ����
		if(accumulatedRotation < maxRotation){
			System.out.println(location + " Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ"); //����ȸ��, ���� �����ش�.
			return true;
		}else{
			System.out.println("*** " + location + " Tire ��ũ ***"); // ����ȸ������ �ִ�ȸ������ �������� ����, ��ũ�� �ǹ�
			return false;
		}
	}
}
