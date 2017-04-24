package ch11.exam11;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		sb.deleteCharAt(0);
		System.out.println(sb.toString());
		/*
		sb.delete(4, 6);
		System.out.println(sb.toString());
		*/
		System.out.println();
		System.out.println("�� ���ڼ� : " + sb.length());
		
		String result = sb.toString();
		System.out.println(result);
	}

}
