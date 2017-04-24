package ch18.exam25.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample2 {

    public static void main(String[] args) {
         ServerSocket serverSocket = null;
        try {
            // 서버 소켓 생성
            serverSocket = new ServerSocket();
            // 포트와 바인딩
            serverSocket.bind(new InetSocketAddress("192.168.3.22",50001)); // 특정 IP로 들어오는 연결만 수락.
            // 연결 요청 대기
            while(true){
            Socket socket = serverSocket.accept();
            // 클라이언트의 정보 얻기
            // --- ServerExample1 ---
            // 통신 코드
            InputStream is = socket.getInputStream();
            byte[] data = new byte[100]; // 받고자하는 데이터를 담을 공간, 길이는 임의 지정
            
            int readBytes = is.read(data);
            if(readBytes == -1){
                throw new IOException("클라이언트가 정상 종료");
            }
            String strData = new String(data, 0, readBytes, "UTF-8");          
            System.out.println("받은 데이터 : " + strData );
            
            OutputStream os = socket.getOutputStream();
            strData +=" 현규'Server";
            data = strData.getBytes("UTF-8");
            os.write(data);
            os.flush();
            System.out.println("데이터 보내기 성공");
            // 연결 끊기
            socket.close();
            }
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
        // server socket이 50010을 현재 사용하고 있느냐?
        if(serverSocket != null && !serverSocket.isClosed()){
            // 서버 소켓 닫기.
            try {serverSocket.close();} catch (IOException ex1) {}
        }
    }
}
