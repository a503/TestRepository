package ch09.exam07;

public class Example{
	public static void main(String[] args){
		// ���� Ŭ������ �����ϰ� ��ü ����
		
		 class B2 extends A{
			void method(){
				B b = new B();
				b.bMethod();
			}
			
			
			/*@Override
			void bMethod() {
				//super.bMethod();
				System.out.println("B2-bMethod()");
			}*/
		 }
		/* //B2 b2 = new B2();
		 A.B b = new B2();
		 b.bMethod(); // �׻� �����ǵ� �޼ҵ尡 ����
		 */
		 // ���� �ڵ尡 �ʹ� �����ϴ� �����ϰ� �� �� ������?
		
		/*A.B b = new A.B(){
			@Override
			void bMethod() {
				// TODO Auto-generated method stub
				System.out.println("B�� �ڽ���-bMethod");
			}
		}; // new���� ��ȣ�� ���°��� �ָ�
*/		// B��� �Ҹ��� �༮�� ����ؼ� b��� ���� �ִµ� �߰�ȣ��
		// �ڽİ�ü�� �ʿ��� �༮�� �ۼ�
		B2 b2 = new B2();
		b2.method();
		
	}
}
