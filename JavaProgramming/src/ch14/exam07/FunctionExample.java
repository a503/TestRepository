package ch14.exam07;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		method1(d->(int)d);
		method1(d->(int)Math.round(d));
		method2(s->s.getMid());
		method2(s->s.getMname());
	}
	public static void method1(DoubleToIntFunction arg){
		int result = arg.applyAsInt(3.54);
		System.out.println(result);
	}
	public static void method2(Function<Member, String> arg){
		String result = arg.apply(new Member("white", "ȫ�浿"));
		System.out.println(result);
	}
}
