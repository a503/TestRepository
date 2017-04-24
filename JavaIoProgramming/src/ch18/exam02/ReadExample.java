/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class ReadExample {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String path = ReadExample.class.getResource("test.txt").getPath(); // url을 통해 path를 가져왔다.
        InputStream is = new FileInputStream(path); //파일로 Input을 받겠다.
        
        byte[] data = new byte[20];
        int readBytes;
        String strData = "";
        
        while(true){
            readBytes = is.read(data);
            if(readBytes == -1){
                break;
            }
            System.out.println("읽은 바이트 수 : " + readBytes);
            System.out.println("읽은 바이트 값 : " + Arrays.toString(data));
            strData += new String(data, 0, readBytes);
        }
        System.out.println(strData);
        
        is.close();
        // 1바이트씩 읽은게 아니라 여러 바이트를 읽기 때문에 한글이 복원된다.
        
        
//        int readByte = is.read(data);
//        System.out.println("읽은 바이트 수 : " + readByte);
//        System.out.println("읽은 바이트 값 : " + Arrays.toString(data));
//        String strData = new String(data, 0, readByte);
//        System.out.println("읽은 문자열 : " + strData);
//        
//        readByte = is.read(data);
//        System.out.println("읽은 바이트 수 : " + readByte);
//        System.out.println("읽은 바이트 값 : " + Arrays.toString(data));
//        strData = new String(data, 0, readByte);
//        System.out.println("읽은 문자열 : " + strData);
        // 총 5개 이므로 3개 읽고, 남은 2개를 읽었다.

    }
}
