/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam10;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ConsoleExample {
    public static void main(String[] args) throws IOException{
        //int keycode = System.in.read();
        
        InputStream is = System.in;
        //int keycode = is.read();
        
        //how1
        System.out.println("how1");
        byte[] keyCodes = new byte[10];
        int readBytes = -1;
        while(true){
            readBytes = is.read(keyCodes);
            if(readBytes == -1) break;
    
            System.out.println(Arrays.toString(keyCodes));
            String str = new String(keyCodes, 0, readBytes-2);
            System.out.println(str);
        }
        //is.close();
        //how2
        System.out.println("how2");
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        System.out.println(str2);
        
        //how3 콘솔이라는 객체를 얻는 방법, IDE에서는 문제발생할 수 있으므로, 명령 프롬프트에서 테스트하자
        System.out.println("how3");
        Console console = System.console();
        String str3 = console.readLine();
        System.out.println(str3);
    }
}
