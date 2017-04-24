package ch07.exam08;

public abstract class Tire {
	//Field
	private int diameter;
	//Constructor
	Tire(){
		System.out.println("Tire ��ü ����");
	}// new�� ��ü�� �������� ���Ѵٰ� �����ڰ� ���� ���� �ʴ� ���� �ƴϴ�. �ڽ��� �����ڿ��� super()�� �̿��� ��ü�� �����Ѵ�.
	//Method
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	// abstract Method
	abstract void roll(); // �߻� �޼ҵ�; ���� ��� ����.
	
	//�߻� Ŭ��������ؼ� �ٸ� �Ϲ� ����� �������� ���ϴ°��� �ƴϴ�.
}
