package homework03.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket();
            System.out.println("연결 요청");
            socket.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("연결 성공");

            byte[] bytes = null;
            String msg = null;

            OutputStream os = socket.getOutputStream();
            msg = "Hello Server made by KHK";
            bytes = msg.getBytes("UTF-8"); // 인코딩을 확정 받는쪽도 인코딩을 맞추어야 한다.
            os.write(bytes);
            os.flush();
            System.out.println("데이터 보내기 성공");

            InputStream is = socket.getInputStream();
            bytes = new byte[100];
            int readBytes = is.read(bytes);
            msg = new String(bytes, 0, readBytes, "UTF-8");
            System.out.println("받은 데이터 : " + msg);

            os.close();
            is.close();
        } catch (Exception e) {
        }
        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException ex) {
            }
        }
    }
}
