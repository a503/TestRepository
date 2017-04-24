package ch18.exam23writeReadObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class VVIP extends Person implements Serializable{
    private int memberShipNo;
    private String grade;

    public VVIP() {
    }

    public VVIP(int memberShipNo, String greade, String name, int age) {
        super(name, age);
        this.memberShipNo = memberShipNo;
        this.grade = greade;
    }
    public int getMemberShipNo() {
        return memberShipNo;
    }
    public void setMemberShipNo(int memberShipNo) {
        this.memberShipNo = memberShipNo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeUTF(getName());
        out.writeInt(getAge());
        out.defaultWriteObject();
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        setName(in.readUTF());
        setAge(in.readInt());
        in.defaultReadObject();
    }
}
