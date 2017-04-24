package homework02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream("src/homework02/file/picture.jpg");
        BufferedInputStream bis = new BufferedInputStream(is);
        
        OutputStream os = new FileOutputStream("src/homework02/file/picture1.jpg");
        BufferedOutputStream bos = null;
        
        int readDatas = -1;
        long startTime = 0;
        long endTime = 0;
        
        startTime = System.nanoTime();
        while(true){
            readDatas = bis.read();
            if(readDatas == -1) break;
            os.write(readDatas);
        }
        os.flush();
        endTime = System.nanoTime();
        System.out.println("1 :" + (endTime-startTime));
        os.close();bis.close();is.close();
        
        is = new FileInputStream("src/homework02/file/picture.jpg");
        bis = new BufferedInputStream(is);
        
        os = new FileOutputStream("src/homework02/file/picture2.jpg");
        bos = new BufferedOutputStream(os);
        startTime = System.nanoTime();
        while(true){
            readDatas = bis.read();
            if(readDatas == -1) break;
            bos.write(readDatas);
        }
        bos.flush();
        os.flush();
        endTime = System.nanoTime();
        System.out.println("1 :" + (endTime-startTime));
        bos.close(); os.close(); bis.close(); is.close();
    }
}
