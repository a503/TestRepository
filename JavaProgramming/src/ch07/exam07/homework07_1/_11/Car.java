package ch07.exam07.homework07_1._11;

public class Car {
	//Field �迭�� �������� ��ü�� ����
	Tire[] tires = {
		new Tire("�տ���", 6),
		new Tire("�տ�����", 2),
		new Tire("�ڿ���", 3),
		new Tire("�ڿ�����", 4)
	};
	// Method
	// ��� Ÿ�̾ 1ȸ ȸ����Ų��.
	int run(){
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		for(int i = 0 ; i<tires.length ; i ++ ){
			if(tires[i].roll() == false){
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop(){
		System.out.println("[�ڵ����� ����ϴ�.]"); // ��ũ�� ������(���� ȸ���� = �ִ� ȸ����)
	}
}
