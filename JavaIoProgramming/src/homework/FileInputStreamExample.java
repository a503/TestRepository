package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("src/homework/FileInputStreamExample.java");
        
        int data = -1;
//        while((data = fis.read()) != -1){
//            System.out.write(data);
//        }
        while(true){
            data = fis.read();
            if(data == -1) break;
            System.out.write(data);
        }
        fis.close();
    }
    
}
