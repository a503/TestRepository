package ch18.exam28;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class SendExample {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket dgs = new DatagramSocket();
        
        System.out.println("-- 발신 시작 --");
        
        String strData = "Hello, My Data";
        byte[] data = strData.getBytes();
        DatagramPacket dgp = new DatagramPacket(
                data,
                data.length,
                new InetSocketAddress("192.168.3.22", 50002)
        );
        dgs.send(dgp);
        
        dgs.close();
    }
}
