package homework.ch09.example._07;

public class Anonymous extends Person{
	Person field = new Person(){
		@Override
		void wake() {
			System.out.println("아침 6시에 일어납니다.");
			work();
		}
		void work(){
			System.out.println("출근합니다.");
		}
	};
	
	void method1(){
		//this.field.work();
		Person localVariable = new Person(){
			@Override
			void wake() {
				System.out.println("아침 7시에 일어납니다.");
				walk();
			}
			void walk(){
				System.out.println("산책 합니다.");
			}
		};
		
		localVariable.wake();
	}
	
	void method2(Person person){
		
		person.wake();
	}
}
