package ch18.exam15buffered;

import java.io.*;

public class BufferedExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream os = new FileOutputStream("src/ch18/text/test15.txt");
        byte[] data = "가나다라마바사아자차카파타하".getBytes();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        
        long startTime;
        long endTime;
        
        
        startTime = System.nanoTime();
        for(int i=0 ; i<1000 ; i++){
            os.write(data); // 이 부분에서 조금 지연된다.
        } // 1367911
       
        endTime = System.nanoTime();
        
        System.out.println("걸린 시간 : " + (endTime-startTime));
         // 21383
        
//        startTime = System.nanoTime();
//        for(int i=0 ; i < 1000 ; i++){
//            bos.write(data);
//        } // 236634
//        endTime = System.nanoTime();
        
        //System.out.println("걸린 시간 : " + (endTime-startTime));
        //bos.flush();
        os.flush();
        bos.close();
        os.close();
    }
}
