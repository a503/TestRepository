package ch18.exam18datastream;

import java.io.*;

public class PrimitiveDataExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int value = 10;
        double value2 = 2.5;
        boolean value3 = false;
        String value4 = "자바";
        
        OutputStream os = new FileOutputStream("src/ch18/text/test.dat"); // .dat 숫자로 저장시키기위해, 문자 10과는 다르다, 이런 파일을 binary파일
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeInt(value); // 데이터가 저장되므로 텍스트에디터로는 정상결과가 안보인다. 깨진 이상한 문자 보인다.
        dos.writeDouble(value2);
        dos.writeBoolean(value3);
        dos.writeUTF(value4);
        
        //------------------------------------------------------------------------------------------------------------------------------------=

        InputStream is = new FileInputStream("src/ch18/text/test.dat");
        DataInputStream dis = new DataInputStream(is);
        
        // 여러 타입의 데이터를 읽을 때는 저장한 순서대로 읽어야 한다.
        int readValue = dis.readInt();
        double readDouble = dis.readDouble();
        boolean readBoolean = dis.readBoolean();
        String readString = dis.readUTF();
        
        System.out.println(readValue);
        System.out.println(readDouble);
        System.out.println(readBoolean);
        System.out.println(readString);

        dis.close();
        is.close();
        dos.flush();
        os.flush();
        dos.close();
        os.close();
    }
}
