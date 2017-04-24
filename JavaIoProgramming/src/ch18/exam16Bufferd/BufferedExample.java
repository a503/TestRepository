package ch18.exam16Bufferd;

import java.io.*;

public class BufferedExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //byte[] data = "가나다라마바사아자차카파타하".getBytes(); // BufferedWriter가 보조스트림으로 사용했으므로 바이트로 변환할 필요 없다.
        
        OutputStream os = new FileOutputStream("src/ch18/text/test15.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
  
        for(int i=0 ; i < 1000 ; i++){
            bw.write("가나다라마바사아자차카파타하\n");
        }
        
        // 
        bw.flush();
        osw.flush();
        os.flush();
        
        bw.close();
        osw.close();
        os.close();
    }
}
