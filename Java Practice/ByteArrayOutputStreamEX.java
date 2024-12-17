import java.io.*;
public class ByteArrayOutputStreamEX {
    public static void main(String[] args)throws Exception {
        FileOutputStream fout1=new FileOutputStream("Abe.txt");
        FileOutputStream fout2=new FileOutputStream("Abp.txt");
        ByteArrayOutputStream bout=new ByteArrayOutputStream();

        bout.write(65);
        bout.write(60);
        bout.write(55);

        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();
        System.out.println("Success");

    }
}
