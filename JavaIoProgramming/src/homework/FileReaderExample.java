package homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("src/homework/FileReaderExample.java");
        
        int readChar = -1;
        char[] cbuf = new char[100]; // Reader 사용, 문자 저장, 자바에서는 모든 종류(? 한자?)의 문자를 2Byte처리
        String data = "";
        
        while(true){
            readChar = fr.read(cbuf); // 
            if(readChar == -1) break;
            data = new String(cbuf, 0, readChar);
            System.out.print(data);
        }
        fr.close();
    }
}
