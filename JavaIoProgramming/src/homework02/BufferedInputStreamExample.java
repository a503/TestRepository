package homework02;

import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception{
        long startTime=0;
        long endTime=0;
        
        FileInputStream fis1 = new FileInputStream("src/homework02/file/picture.jpg");
        //startTime = System.currentTimeMillis();
        startTime = System.nanoTime();
        while(true){
            if(fis1.read() == -1) break;
        }
        //endTime = System.currentTimeMillis();
        endTime = System.nanoTime();
        System.out.println("FileInputStream : " + (endTime-startTime));
        fis1.close();            
        
        FileInputStream fis2 = new FileInputStream("src/homework02/file/picture.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        //startTime = System.currentTimeMillis();
        startTime = System.nanoTime();
        while(true){
            if(bis.read() == -1) break;
        }
        //endTime = System.currentTimeMillis();
        endTime = System.nanoTime();
        System.out.println("FileInputStream : " + (endTime-startTime));
        bis.close();
        fis2.close();
    }
}
