package ch11.exam09;

public class StringIndexofExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");
		//int location = subject.indexOf(101); // �Է��� �Ű����� ���� Ű�ڵ带 ������ ���ڰ� ������ ã�´�.
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1){
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}else{
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
	}
	// subject.contains() �޼ҵ�� ��ġ�ϴ� ���ڿ��� ã�ƺ��� ��ġ�ϴ� ���ڿ��� ������ true, ������ false ��ȯ
}
