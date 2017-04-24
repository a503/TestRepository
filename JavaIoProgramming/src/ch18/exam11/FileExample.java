package ch18.exam11;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ch18/exam11/FileExample.java");
        
        System.out.println(file.exists()); // 파일이 실제로 존재하느냐? (R : boolean)
        System.out.println(file.length()); // 파일의 크기(R : long)
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        
        File dir = new File("C:/Windows");
        
        System.out.println(dir.exists());
        System.out.println(dir.length());
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
        
        String[] contents1 = dir.list();
        File[] contents2 = dir.listFiles();
        
        for(File f : contents2){
            String info = "";
            info += f.getName();
            info += "\t\t";
            info += (f.isDirectory())?"<DIR>":"";
            info += "\t\t";
            info += f.length();
            //System.out.println(info);
        }
        
        // 파일 및 디렉토리의 생성 & 삭제 (생성은 잘 안함)
        File file2 = new File("C:/Temp/test.txt");
        file2.createNewFile();
        file2.delete();
        File dir2 = new File("C:/Temp/dir2/dir3/dir4/dir5");
        //dir2.mkdir();
        dir2.mkdirs();
        
        dir2.delete();
    }
}
