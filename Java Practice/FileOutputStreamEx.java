import java.io.*;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream ("C:\\Users\\91845\\Documents\\GitHub\\Java-Full-Stack-Practice\\Java Practice\\FOS.java",true);

            String s="Welcome";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
