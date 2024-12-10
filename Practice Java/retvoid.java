//Return type void method
import java.util.*;
public class retvoid {
    int addition()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nos");

        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;

        return c;
    }
    public static void main(String args[])
    {
        retvoid p=new retvoid();
        int x= p.addition();
        System.out.println("addition : "+ x);
    }
    
}
