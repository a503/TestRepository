package homework02;

import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        
        int readCharNo;
        char[] cbuf = new char[100];
        
        while(true){
            readCharNo = reader.read(cbuf);
            if(readCharNo == -1) break;
            String data = new String(cbuf, 0, readCharNo);
            System.out.println(data);
        }
        
        reader.close();
        is.close();
    }
}
