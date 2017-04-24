package ch18.exam28;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveExample {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket dgs = new DatagramSocket(50002);
        
        DatagramPacket dgp = new DatagramPacket(new byte[100], 100);
        dgs.receive(dgp);
        
        String strData = new String(dgp.getData(), 0, dgp.getLength());
        
        System.out.println("받은 데이터 : " + strData);
        
        dgs.close();
    }
}
