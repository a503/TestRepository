package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 파일(이미지) 복사하기, 어떤 파일이든지 상관없다.
        String originalFileName = "src/homework/Tulips.jpg";
        String targetFileName = "src/homework/Tulips2.jpg";
        
        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);
        
        int readBytes;
        byte[] data =  new byte[100]; // 100바이트씩 읽어서 전송
        
        while(true){
            readBytes = fis.read(data);
            if(readBytes == -1) break;
            fos.write(data, 0, readBytes);
        }
        
        fos.flush();
        fos.close();
        fis.close();
        
        System.out.println("복사 성공");
    }
}
