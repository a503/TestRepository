package ch05.exam01;

public class NullPoninterException {

	public static void main(String[] args) {
		/*
		int[] scores =  null;
		
		System.out.println(scores[0]); // compile error not found, �����Ҷ� ���� �߻�(NullPointerException)
		// ��Ű��.Ŭ������.�޼ҵ�(�����߻� ����)<-�����ڵ�
		// � ���������� null�̶�� ���� ������ ������ �ƹ��� ��ü�� �������� �����Ƿ� �� ��ü�� ���� �����͸� �䱸�Ҷ� �߻�
		*/
		String name = null;
		System.out.println(name.length()); // ��������. <- ��ü ���� ������, �� ��ü�� ������ �ִ� length��� �޼ҵ带 �����϶�.
		System.out.println(name.toString()); // name�� �����ϴ� ��ü�� �����Ƿ� NullPointerException �߻� ,**���� ���� �߻��ϴ� ������ �ϳ�.
		
	}

}
