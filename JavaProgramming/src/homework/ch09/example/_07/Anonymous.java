package homework.ch09.example._07;

public class Anonymous extends Person{
	Person field = new Person(){
		@Override
		void wake() {
			System.out.println("��ħ 6�ÿ� �Ͼ�ϴ�.");
			work();
		}
		void work(){
			System.out.println("����մϴ�.");
		}
	};
	
	void method1(){
		//this.field.work();
		Person localVariable = new Person(){
			@Override
			void wake() {
				System.out.println("��ħ 7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
			void walk(){
				System.out.println("��å �մϴ�.");
			}
		};
		
		localVariable.wake();
	}
	
	void method2(Person person){
		
		person.wake();
	}
}
