package homework.ch09.example._05;

public class Outter {
	String field = "Outter-field";
	
	void method(){
		System.out.println("Outer-Method");
	}
	
	class Nested{
		String field = "Nested-Field";
		
		void method(){
			System.out.println("Nested-Method");
		}
		
		void print(){
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
