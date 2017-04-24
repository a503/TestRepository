package ch11.exam08;

import java.io.IOException;

public class StringConstructorExample {

	public static void main(String[] args) throws IOException {
		String s1 = "abc";
		String s2 = new String("abc"); // String(String original)
		
		char[] charArr = {'a', 'b', 'c'};
		String s3 = new String(charArr); // String(char[] value)
		
		byte[] byteArr = {49, 50, 51};
		String s4 = new String(byteArr); // String(byte[] value)
		System.out.println(s4); // keyCode
		
		//byte[] inputData = new byte[100];
		//int readByteNo = System.in.read(inputData); // ����Ʈ �迭�� �־��ָ� Ű����� �Է��� �����Ͱ� �Ѳ����� �а� �迭�� �����Ͱ� �ִ� ���� ���̸� �������ش�.
		//String strData = new String(inputData, 0, readByteNo-2); // String(byte[] bytes, int offset, int length)
		//System.out.println(strData);
		//System.out.println(strData.length());
		
		byte[] byteArr2 = {49, 50, 51, 52, 53, 54, 55};
		String strData2 = new String(byteArr2, 3, 3);
		
		System.out.println(strData2);
		
	}

}
