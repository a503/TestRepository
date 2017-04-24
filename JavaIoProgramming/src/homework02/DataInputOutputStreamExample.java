package homework02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("src/homework02/file/primitive.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        
        dos.writeUTF("홍길동");
        dos.writeDouble(3.5);
        dos.writeInt(1);
        
        dos.writeUTF("감자바");
        dos.writeDouble(90.5);
        dos.writeInt(2);
        
        dos.flush();fos.flush();dos.close();fos.close();
        
        InputStream is = new FileInputStream("src/homework02/file/primitive.dat");
        DataInputStream dis = new DataInputStream(is);
//        int read=-1;
//        while(dis.readUTF() != null){
//            String name = dis.readUTF();
//            double score = dis.readDouble();
//            int order = dis.readInt();
//
//            System.out.println(name + " : " + score + " : " + order);
//        }
        for(int i = 0 ; i<2 ; i++){
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }
        dis.close(); is.close();
    }
}
