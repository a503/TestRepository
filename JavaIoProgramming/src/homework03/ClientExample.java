package homework03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 50001);
        OutputStream os = socket.getOutputStream();

        String filePath = "src/homework03/file/picture.jpg";
        File file = new File(filePath);

        String fileName = file.getName();
        byte[] data = new byte[100];
        data = fileName.getBytes();
        os.write(data);
        os.flush();

        System.out.println("[파일 보내기 시작]" + fileName);

        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1000];
        int readDatas = -1;
        while (true) {
            readDatas = fis.read(bytes);
            if (readDatas == -1) {
                break;
            }
            os.write(bytes, 0, readDatas);
        }
        os.flush();
        System.out.println("[파일 보내기 완료]");

        fis.close();
        os.close();
        socket.close();
    }
}
