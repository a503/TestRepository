package homework02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("src/homework02/file/Object4.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        Child child = new Child();
        child.field1 = "Hong";
        child.field2 = "Hong2";
        
        oos.writeObject(child);
        oos.flush();oos.close();fos.close();
        
        FileInputStream fis = new FileInputStream("src/homework02/file/Object4.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Child v = (Child) ois.readObject();
        System.out.println("field1 : " + v.field1);
        System.out.println("field2 : " + v.field2);
        
        ois.close();fis.close();
    }
}
