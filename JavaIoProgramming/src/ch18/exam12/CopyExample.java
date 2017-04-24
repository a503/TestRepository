package ch18.exam12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream("src/ch18/exam12/Penguins.jpg");
        BufferedInputStream bis = new BufferedInputStream(is);
        
        OutputStream os = new FileOutputStream("src/ch18/exam12/Penguins2.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        
        byte[] data = new byte[1024];
        int readData = -1; 
        
        while(true){
            readData = bis.read();
            if(readData == -1) break;
            bos.write(readData);
        }
        
        is.close();
        os.flush();
        os.close();
    }
}
