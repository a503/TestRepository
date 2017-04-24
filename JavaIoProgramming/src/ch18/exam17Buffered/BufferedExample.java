package ch18.exam17Buffered;

import java.io.*;

public class BufferedExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Scanner 만들기
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String line = br.readLine(); // BufferedReader는 추가적으로 readLine()메소드를 가지고 있다. 행 단위로 구분된 문자열을 한꺼번에 읽은 수 있다(Line단위로)
        
        System.out.println(line);
        
        // 열린 스트림들 정리
        br.close();
        isr.close();
        is.close();
    }
}
