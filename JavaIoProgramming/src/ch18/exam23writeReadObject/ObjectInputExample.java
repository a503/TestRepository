package ch18.exam23writeReadObject;

import java.io.*;

public class ObjectInputExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("src/ch18/text/object23.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        VVIP vip = (VVIP) ois.readObject();
        
        System.out.println(vip.getMemberShipNo());
        System.out.println(vip.getGrade());
        System.out.println(vip.getName());
        System.out.println(vip.getAge());

        ois.close();
        fis.close();
        // 질문 메소드정보가 안넘어가면 어떻게 사용하지 받는쪽에서
    }
}
