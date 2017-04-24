package homework;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample1 {
    public static void main(String[] args) throws IOException {
        System.out.println("============================메뉴============================");
        System.out.println("1. 예금 조회 " + "| 2. 예금 출금 " + "| 3. 예금 입금 " + "| 4. 종료 하기");
        System.out.println("============================================================");
        System.out.print("메뉴를 선택하시오> ");
        
        InputStream is = System.in;
        
        char inputChar = (char)is.read(); // input stream으로 들어온 keycode를 문자로 변환
        
        switch(inputChar){ 
            case '1':
                System.out.println("예금 조회를 선택하셨습니다.");
                break;
            case '2':
                System.out.println("예금 출금을 선택하셨습니다.");
                break;
            case '3':
                System.out.println("예금 입금을 선택하셨습니다.");
                break;
            case '4':
                System.out.println("종료 하기를 선택하셨습니다.");
                break;
                
        }
        is.close();
    }
}
