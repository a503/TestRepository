package ch18.exam19linedata;

import java.io.*;

public class LineDataExample {
    public static void main(String[] args) throws IOException {
        /*
        FileWriter fw = new FileWriter("src/ch18/text/test19.txt");
        fw.write("abcde\n");
        fw.write("12345\n");
        fw.write("가나다라마바사\n");
        
        fw.flush();
        fw.close();
        */
        /*
        FileOutputStream fos = new FileOutputStream("src/ch18/text/test19_1.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        
        osw.write("abcde\n");
        osw.write("12345\n");
        osw.write("가나다라마바사\n");
        
        osw.flush();
        fos.flush();
        
        osw.close();
        fos.close();
        */
        FileOutputStream fos = new FileOutputStream("src/ch18/text/test19_2.txt");
        //PrintStream out = new PrintStream(fos);
        PrintWriter out = new PrintWriter(fos);  // 이것도 된다, 입맛에 맞게 선택
        
        out.println("abcde");
        out.println("12345");
        out.print("가나다");
        
        out.flush();
        fos.flush();
        out.close();
        fos.close();
        
        FileInputStream fis = new FileInputStream("src/ch18/text/test19_2.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        while(true){
            String line = br.readLine();
            if(line == null) break; // readLine은 더 이상 읽을게 없을 경우 null을 리턴
            System.out.println(line);
        }
        
        br.close();
        isr.close();
        fis.close();
    }
}
