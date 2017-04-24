package homework02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableReader {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/homework02/file/Object2.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        ClassA v = (ClassA) ois.readObject();
        System.out.println("field1 : " + v.field1);
        System.out.println("field2.field1 : " + v.field2.field1);
        System.out.println("field3 : " + v.field3);
        System.out.println("field4 : " + v.field4);
        
    }
}
