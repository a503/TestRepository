package homework02;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception{
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        
        System.out.print("입력> ");
        String line = br.readLine(); // BufferedReader에 있는 readLine()메소드, 구분자(\r\n)을 기준으로 한줄을 읽는다.
        
        System.out.println("출력 : " + line);
    }
}
