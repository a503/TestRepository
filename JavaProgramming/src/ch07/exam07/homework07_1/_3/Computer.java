package ch07.exam07.homework07_1._3;

public class Computer extends Calculator{
	// ��ӹ��� �θ��� �޼ҵ带 ������ �ߴ�(�������̵�)
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
	double superAreaCircle(double r){
		return super.areaCircle(r);
	}
}
