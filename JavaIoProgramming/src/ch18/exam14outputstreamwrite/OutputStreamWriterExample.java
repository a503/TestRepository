package ch18.exam14outputstreamwrite;

import java.io.*;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream os = new FileOutputStream("src/ch18/text/test14.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os); // 귀찮은 바이트변환을 대신해줄 보조 스트림 생성
        
        /*
        String str = "가abc다";
        os.write(str.getBytes());
        */
        osw.write("가나다라마바사아자차카파타하헤헤"); // 문자열을 바이트배열로 변환하지않고 바로 보낼 수 있게 되었다.
        
        osw.flush();
        osw.close();
        os.flush();
        os.close();
    }
}
