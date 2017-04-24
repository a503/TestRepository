package ch18.exam25.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientExample1 {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // how1
            //socket = new Socket("192.168.3.22", 50010);
            socket = new Socket();
            // how2
            socket.connect(new InetSocketAddress(50010)); // 자유롭게 연결을 끊고 재상용 할 수 있다.
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(!socket.isClosed()){
            try {socket.close();} catch (IOException ex) { }
        }
    }
}
