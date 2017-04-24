/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam04;

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
        OutputStream os = new FileOutputStream("src/ch18/exam04/test.txt");
        
        //byte[] data = {97, 98, 99};
        byte[] data = "abc".getBytes();
        
        os.write(data);
        
        os.flush();
        os.close();
    }
}
