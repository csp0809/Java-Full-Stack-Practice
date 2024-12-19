import java.io.*;
public class DeSerialisation {
    public static void main(String[] args)throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
        SerializationStudent s=(SerializationStudent)in.readObject();
        System.out.println(s.id+" "+s.name);
        in.close();
    }
}
