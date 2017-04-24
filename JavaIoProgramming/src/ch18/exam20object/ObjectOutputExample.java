package ch18.exam20object;

import java.io.*;

public class ObjectOutputExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/ch18/text/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        Member member = new Member("감자바", 30);      
        oos.writeObject(member); // 직렬화 할 수 있는 객체만 와야한다.
        
        oos.flush();
        fos.flush();
        oos.close();
        fos.close();
    }
}
