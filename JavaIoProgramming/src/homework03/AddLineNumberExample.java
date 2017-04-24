package homework03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "src/homework03/exam03/UDPReceiveExample.java";
        
        InputStream is = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        int read = -1;
        int lineNum = 0;
        
        while(true){
            read = br.read();
            if(read == -1) break;
            String strData = br.readLine();
            lineNum++;
            System.out.println(lineNum+": " + strData);
        }
        br.close();isr.close();is.close();
        
    }
}
