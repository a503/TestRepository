package ch11.exam10;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		
		String[] names = text.split("&|,|-");
		
		for(int i = 0 ; i < names.length ; i ++){
			System.out.println(names[i] + "��");
		}
	}

}
