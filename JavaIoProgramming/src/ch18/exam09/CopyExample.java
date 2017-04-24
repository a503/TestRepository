/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Administrator
 */
public class CopyExample {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Reader r = new FileReader("src/ch18/exam09/test.txt");
        Writer w = new FileWriter("src/ch18/exam09/test2.txt");
        
        char[] data = new char[5];
        int readChar = -1;
        while(true){
            readChar = r.read(data);
            if(readChar == -1){
                break;
            }
            w.write(data, 0, readChar);
        }
        w.flush();
        w.close();
        r.close();
    }
}
