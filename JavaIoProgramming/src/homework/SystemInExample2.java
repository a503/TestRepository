package homework;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class SystemInExample2 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        byte[] datas = new byte[100]; // 한 번에 100바이트씩 읽어 배열에 저장하겠다.

        System.out.print("이름 : ");
        int nameBytes = is.read(datas);
        String name = new String(datas, 0, nameBytes - 2);
        // System.out.println(Arrays.toString(datas));
        
        System.out.print("하고 싶은말 : ");
        int commentBytes = is.read(datas);
        String comment = new String(datas, 0, commentBytes - 2);
        // System.out.println(Arrays.toString(datas));

        System.out.println("입력한 이름 : " + name);
        System.out.println("입력한 하고 싶은말 : " + comment);
        
        // NetBeans console에서는 제대로 실행되지 않는다 개행을 처리하는 키코드가 다르다
        // 하지만, console에맞게 -1만 해도 문제 발생 -> IDE 문제?
        
        is.close();
    }
}
