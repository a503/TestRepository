package ch18.exam23writeReadObject;

import java.io.*;

public class ObjectOutputExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/ch18/text/object23.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        VVIP vip = new VVIP(1, "골드","감자바", 26);
        oos.writeObject(vip); // 직렬화 할 수 있는 객체만 와야한다.
        
        oos.flush();
        fos.flush();
        oos.close();
        fos.close();
    }
}
