package homework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File dir = new File("src/homework/dir"); // path 임의 변경
        File file1 = new File("src/homework/file1");
        File file2 = new File("src/homework/file2");
        File file3 = new File("src/homework/file3");
        
        if(dir.exists() == false){
            dir.mkdirs();
        }
        if(file1.exists() == false){
            file1.createNewFile();
        }
        if(file2.exists() == false){
            file2.createNewFile();
        }
        if(file3.exists() == false){
            file3.createNewFile();
        }
        
        File temp = new File("src/homework");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd\ta\tHH:mm");
        File[] contents = temp.listFiles();
        System.out.println("날짜\t\t\t시간\t형태\t\t크기\t이름");
        
        for(File file : contents){
            System.out.print(sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()){
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            }else{
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
