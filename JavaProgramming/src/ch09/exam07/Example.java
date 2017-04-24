package ch09.exam07;

public class Example{
	public static void main(String[] args){
		// 로컬 클래스를 정의하고 객체 생성
		
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
		 b.bMethod(); // 항상 재정의된 메소드가 실행
		 */
		 // 위의 코드가 너무 복잡하다 간단하게 할 수 없을까?
		
		/*A.B b = new A.B(){
			@Override
			void bMethod() {
				// TODO Auto-generated method stub
				System.out.println("B의 자식의-bMethod");
			}
		}; // new에서 괄호가 오는것을 주목
*/		// B라고 불리는 녀석을 상속해서 b라는 곳에 넣는데 중괄호에
		// 자식객체에 필요한 녀석을 작성
		B2 b2 = new B2();
		b2.method();
		
	}
}
