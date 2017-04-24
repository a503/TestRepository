package ch14.exam07;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// Method1
		method1(new Consumer<String>(){
			@Override
			public void accept(String t) {
					System.out.println("�͸�ü " + t);
			}
		});
		method1(t -> System.out.println("���ٽ� " + t) );
		
		// Method2
		method2((t, u) -> {
			System.out.println(t + " - " + u);
		});
		method3((t, u)->{
			for(int i = 0 ; i < u ; i++){
				System.out.println(t + (i+1));
			}
		});
		
	}
	public static void method1(Consumer<String> arg){ // String��ü�� �޾� �Ҹ�
		arg.accept("Java");
	}
	public static void method2(BiConsumer<String, String> arg){
		arg.accept("Iot", "Java");
	}
	public static void method3(ObjIntConsumer<String> arg){
		arg.accept("ȫ�浿", 1);
	}
}
