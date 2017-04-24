/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Administrator
 */
public class WriteExample {
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
        //String path = WriteExample.class.getResource("test.txt").getPath();
        //OutputStream os = new FileOutputStream(path);
        //원래는 이런식으로 해야한다.
        
        OutputStream os = new FileOutputStream("src/ch18/exam03/test.txt");
        // os.write(97);
        // os.flush();
        // Thread.sleep(5000);
        
        for(int i = 0 ; i < 20 ; i++){
            os.write(97);
        }
        os.flush();
        os.close();
    }
}
