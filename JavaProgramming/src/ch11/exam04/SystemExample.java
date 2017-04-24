package ch11.exam04;

public class SystemExample {
	public static void main(String[] args){
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) { // System.exit(n)�� ȣ��ɶ� �� �޼ҵ嵵 �Բ� ȣ��ȴ�. �� checkExit�� ���������� ����Ǹ� JVM����
				if(status != 5555){
					throw new SecurityException(); // SecurityExcption �ڹ� �⺻���� ����
				}
			}
			
		});
		
		// ����
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(i);
			if(i == 5){
				//System.exit(0/* �� ���� �ٲ� ������� �ʰ� �ϰ�ʹ�.(�ܺ����� JVM���� ����) -> �� ��ȣ�� �ȵ��� ���� �ȵǰ� // ��й�ȣ*/); // �׷��� exit�� ��ȣ�� �Ű������� �޴´�.
				//
				try{
				System.exit(5555); // System.exit(n) n�� �ǹ̸� �˾ƺ���.
				}catch(SecurityException e) {} // catch��Ͽ� �ƹ��͵� �Է����� ������ ���ܰ� �߻��ص� �����ϰڴٴ� ��
			}
		}
	}
}
