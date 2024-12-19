import java.io.*;
public class SerializationStudent implements Serializable {
    int id;
    String name;

    public SerializationStudent(int id, String name){
        this.id=id;
        this.name=name;
    }
}

class Abc{
    public static void main(String[] args)throws Exception {
        SerializationStudent s1=new SerializationStudent(232, "Chaitanya");

        FileOutputStream fout=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);

        out.writeObject(s1);
        out.flush();
        System.out.println("success");
    }
}


