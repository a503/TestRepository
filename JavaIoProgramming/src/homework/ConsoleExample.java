package homework;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) throws NullPointerException{
        Console terminal = System.console(); // Console 클래스, 정적 메소드인 .console로 객체 얻을 수 있다.
        boolean flag = false;
        System.out.print("아이디 : ");
        try{
            String id = terminal.readLine(); // 넷빈즈에서는 여기서 에러발생?
        }catch(NullPointerException e){
            System.out.println("???");
            flag = true;
        }
        System.out.print("패스워드 : ");
        char[] charPass = terminal.readPassword();
        String strPassword = new String(charPass); // 콘솔에서 입력문자를 보여주지 않는다. // 실제로 암호에 사용?
        
        System.out.println("---------------------");
        if(flag){
            String id = "";
            System.out.println(id);
        }
        System.out.println(strPassword);
    }
    // 명령 프롬프트에서는 발생하지 않는 NullPointerException 발생
}
