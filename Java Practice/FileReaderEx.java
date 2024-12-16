import java.io.*;
public class FileReaderEx {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("File.txt");
            fw.write("Welcome");
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
