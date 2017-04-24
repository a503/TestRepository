package homework03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 50001));
        
        System.out.println("[서버 시작]");
        while(true){
            try{
                Socket socket = serverSocket.accept();
                
                InputStream is = socket.getInputStream();
                
                byte[] bytes = new byte[1000];
                int readBytes = -1;
                
                readBytes = is.read(bytes);
                String fileName = new String(bytes, 0, readBytes);
                fileName = fileName.trim();
                
                System.out.println("[파일 받기 시작] " + fileName);
                FileOutputStream fos = new FileOutputStream("c:/Temp/" + fileName);
                while(true){
                    readBytes = is.read();
                    if(readBytes == -1) break;
                    fos.write(readBytes);
                }
                fos.flush();
                System.out.println("[파일 받기 완료]");
                
                fos.close();is.close();socket.close();
                
            }catch(Exception e){
                break;
            }
        }
        serverSocket.close();
        System.out.println("[서버 종료]");
    }
}
