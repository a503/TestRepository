package ch18.exam13inputStreamReader;

import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        /*
        InputStream is = System.in; // 이번 예제의 포커스 아니다.여기는 다양한 값이 나올 수 있다.
        // InputStream is = socket.~ // 네트워크에서 들어오는 데이터
        InputStreamReader isr = new InputStreamReader(is);
        
//        InputStream을 문자로 변환할때.
//        int data = is.read(); // 1바이트씩 읽기 때문에 한 문자에 1바이트가 넘는 문자는 깨진다.
//        System.out.println((char) data); // 알파벳은 문제없지만, 한글만 해도 문제가 발생
        
        
        int data = isr.read();
        System.out.println((char)data); // 문자들을 입력 받을 수 있다.(영어, 한글, 한자, ... );
        */
        //InputStream is = new FileInputStream("src/ch18/text/test13.txt"); // UTF-8
        InputStream is = new FileInputStream("src/ch18/text/test13_2.txt"); // ANSI(MS949), 그냥 인풋스트림리더로 받으면 한글이 깨진다, 인코딩이 다르기때문
        InputStreamReader isr = new InputStreamReader(is, "EUC-KR"); // 인코딩을 변환 해주었다. 2번째 매개값의 디폴트는 UTF-8(웹, 자바 표준)이다
        int data = isr.read();
        System.out.println((char) data);
        
        isr.close();
        is.close();
    }
}
