package homework03.exam03;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPSendExample {

    public static void main(String[] args) throws SocketException, UnsupportedEncodingException, IOException {
        DatagramSocket dSocket = new DatagramSocket();

        System.out.println("[발신 시작]");

        for (int i = 1; i < 3; i++) {
            String strData = "message" + i;
            byte[] data = strData.getBytes("UTF-8");
            DatagramPacket dPacket = new DatagramPacket(data, data.length, new InetSocketAddress("localhost", 5001));
            dSocket.send(dPacket);
            System.out.println("보낸 바이트 수 :" + data.length + " bytes");
        }
        System.out.println("발신 종료");
        
        dSocket.close();
    }
}
