import java.io.*;

public class BufferedWriterEx {
    public static void main(String[] args) throws Exception {
        FileWriter writer =new FileWriter("testout.txt");
        BufferedWriter buffer =new BufferedWriter(writer);  
        buffer.write("Welcome");
        buffer.close();
        System.out.println("Success");
    }
}
