import java.io.*;
public class Pract10 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int id;
        String nm;
        double sal;
        char gender;

        System.out.println("Enter ID:");
        id=Integer.parseInt(br.readLine());

        System.out.println("Enter Name : ");
        nm=br.readLine();

        System.out.println("Enter Salary : ");
        sal=Double.parseDouble(br.readLine());

        System.out.println("Enter Gender : ");
        gender=(char)br.read();

        System.out.println(id);
        System.out.println(nm);
        System.err.println(sal);
        System.err.println(gender);
    }
}
