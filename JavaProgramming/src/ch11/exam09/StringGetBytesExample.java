package ch11.exam09;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		System.out.println(bytes1[0] + "             ");
		String str1 = new String(bytes1);
		System.out.println("bytes1->String : " + str1);
		// �����͸� Byte ������ �迭�� �ٲپ��ִ°��� ���ڵ�
		// �ٽ� Ǯ���ִ°��� ���ڵ�
		try{
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			System.out.println(bytes2[0] + "             ");
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String : " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			System.out.println(bytes3[0] + "         ");
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String : " + str3);
			
			byte[] bytes4 = str.getBytes("UTF-16");
			System.out.println("bytes4.length : " + bytes4.length);
			System.out.println(bytes4[0] + "         ");
			String str4 = new String(bytes4, "UTF-16");
			System.out.println("bytes4->String : " + str4);
		}catch(UnsupportedEncodingException e){
			e.printStackTrace(); // ���߿Ϸ�Ǹ� ����� �Ǵ� �ڵ�
		}
	}

}
