package ch18.exam25.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample1 {

    public static void main(String[] args) {
         ServerSocket serverSocket = null;
        try {
            // 서버 소켓 생성
            serverSocket = new ServerSocket();
            // 포트와 바인딩
            serverSocket.bind(new InetSocketAddress("192.168.3.22",50010)); // 특정 IP로 들어오는 연결만 수락.
            // 연결 요청 대기
            Socket socket = serverSocket.accept();
            // 클라이언트의 정보 얻기
            //SocketAddress socketAddress = socket.getRemoteSocketAddress();
            InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
            System.out.println(isa.toString());
            System.out.println(isa.getHostName());
            System.out.println(isa.getAddress());
            // 통신 코드
            
            // 연결 끊기
            socket.close();
        } catch (IOException ex) {
             try {
                 // 서버 소켓 닫기.
                 serverSocket.close();
             } catch (IOException ex1) {}
        }
        
    }
}
