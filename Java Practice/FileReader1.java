import java.io.*;
public class FileReader1 {
    public static void main(String[] args)throws Exception {
        FileReader fr=new FileReader("File.txt");
        int i;
        while ((i=fr.read())!=-1) {
            System.out.println((char)i);
        
        }
        fr.close();//need to close after the loop 
    }
}
