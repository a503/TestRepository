package ch18.exam21object;

import ch18.exam20object.*;
import java.io.Serializable;

public class Member implements Serializable{
    //field
    private String name;
    private int age;
    public static String nation = "한국";
    //constructor
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
