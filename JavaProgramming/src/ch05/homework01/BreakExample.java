 package ch05.homework01;

public class BreakExample {

	public static void main(String[] args) {
		while(true){
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6){
				break; // break���� ���� ����� �ݺ��� �ϳ��� �����Ų��.
			}
		}
		System.out.println("���α׷� ����");
	}

}
