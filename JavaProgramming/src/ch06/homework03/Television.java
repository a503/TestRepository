package ch06.homework03;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static{ // static field�� ������ ���꿡�� ����Ҷ� static block ���
		info = company + "-" + model;
	} // static block ������ instance field�� �����ϸ� ������ ���� �߻�
}
