package homework02;

import java.io.*;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream os = new FileOutputStream("src/homework02/file/test_01.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        
        String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
        
        osw.write(data);
        
        osw.close();
        os.close();
    }
}
