import java.io.*;
public class FileInputStreamEx {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("C:\\Users\\91845\\Documents\\GitHub\\Java-Full-Stack-Practice\\Java Practice\\FOS.java");
    
            int i=0;
    
            while ((i=fin.read())!=-1) {
                System.out.println((char)i);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
