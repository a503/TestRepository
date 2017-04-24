package ch18.exam21object;

import java.io.*;

public class ObjectInputExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("src/ch18/text/object21.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Member member = (Member) ois.readObject();
        
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(Member.nation);
        
        ois.close();
        fis.close();
        // 질문 메소드정보가 안넘어가면 어떻게 사용하지 받는쪽에서
    }
}
