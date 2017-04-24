package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/homework/file.txt");
        FileWriter fw = new FileWriter(file, true);
        // FileWriter의 두번째 매개값은 기존파일이 있으면 덮어쓰는게 아니라 파일의 내용 끝에 데이터를 추가한다.
        
        fw.write("FileWriter는 한글로된\r\n");
        fw.write("문자열을 바로 출력할 수 있다.\r\n");
        // append Test
        //fw.write("추가 문자열");
        
        fw.flush();
        fw.close();
        
        System.out.println("파일을 저장했습니다.");
    }
}
