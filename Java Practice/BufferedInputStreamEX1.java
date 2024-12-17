import java.io.*;
public class BufferedInputStreamEX1 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fout=new FileOutputStream("File.txt");
        BufferedOutputStream bout =new BufferedOutputStream(fout);

        String s="Welcome Home.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
    }
}
