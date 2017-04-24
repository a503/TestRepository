package homework03.exam03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiveExample extends Thread{
    public static void main(String[] args) throws SocketException, InterruptedException {
        DatagramSocket dSocket = new DatagramSocket(5001);
        
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("[수신 시작]");
                try{
                    DatagramPacket dPacket = new DatagramPacket(new byte[100], 100);
                    dSocket.receive(dPacket);
                    
                    String data = new String(dPacket.getData(), 0, dPacket.getLength(), "UTF-8");
                    System.out.println("받은 내용 : " + dPacket.getSocketAddress() + "|" + data);
                }catch(Exception e){
                    System.out.println("[수신 종료]");
                }
            }
        };
        thread.start();
        
        Thread.sleep(10000);
        dSocket.close();
    }
}
