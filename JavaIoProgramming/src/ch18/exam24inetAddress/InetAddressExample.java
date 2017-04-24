package ch18.exam24inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();
        
        String address = ia.getHostAddress();
        System.out.println(address);
        
        InetAddress iaNaver = InetAddress.getByName("www.naver.com");
        System.out.println(iaNaver);
        
        InetAddress[] iaNavers = InetAddress.getAllByName("KOSA-L3-18");
        for(InetAddress i : iaNavers){
            System.out.println(i.getHostAddress());
        }
    }
}
