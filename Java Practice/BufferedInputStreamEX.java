import java.io.*;
public class BufferedInputStreamEX {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("File.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;

            while ((i=bin.read())!=-1) {
                System.out.println((char)i);
            }
            bin.close();
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
