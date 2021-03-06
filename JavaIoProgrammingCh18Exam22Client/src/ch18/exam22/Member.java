package ch18.exam22;

import java.io.Serializable;
// Client
public class Member implements Serializable{
    //field
    private static final long serialVersionUID = 11109305;
    private String name;
    private int age;
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
