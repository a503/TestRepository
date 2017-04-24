/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Administrator
 */
public class ReadExample {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //System.out.println("Hello NetBeans");
        String path = ReadExample.class.getResource("test.txt").getPath(); // url을 통해 path를 가져왔다.
        InputStream is = new FileInputStream(path); //파일로 인풋을 받겠다.
        /*
        int v1 = is.read(); // 1바이트로 읽겠다.
        System.out.println("v1 : " + (char)v1);
        */
//        while(true){
//            int v1 = is.read();
//            if(v1 == -1) break;
//            System.out.print((char)v1);
//        }
        int v2 = -1;
        while((v2 = is.read()) != -1){
            if(v2 == 10) continue;
            System.out.print((char)v2);
        }
        is.close();
    }
}
