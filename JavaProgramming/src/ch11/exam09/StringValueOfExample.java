package ch11.exam09;

public class StringValueOfExample {

	public static void main(String[] args) {
		StringValueOfExample obj = new StringValueOfExample();
		
		boolean b = true;
		
		char c = 'C';
		char[] cArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		int i = 100;
		long l = 100000000000000L;
		double d = 100.9;
		float f = 100.9f;
		
		String str1 = String.valueOf(b);
		String str2 = String.valueOf(c);
		String str3 = String.valueOf(cArr);
		String str4 = String.valueOf(d);
		String str5 = String.valueOf(f);
		String str6 = String.valueOf(i);
		String str7 = String.valueOf(l);
		String str8 = String.valueOf(obj);
		String str9 = String.valueOf(cArr, 5, 3);
		
		System.out.println(str1);
		System.out.println();
		System.out.println(str2);
		System.out.println();
		System.out.println(str3);
		System.out.println();
		System.out.println(str4);
		System.out.println();
		System.out.println(str5);
		System.out.println();
		System.out.println(str6);
		System.out.println();
		System.out.println(str7);
		System.out.println();
		System.out.println(str8);
		System.out.println();
		System.out.println(str9);
	}

}
