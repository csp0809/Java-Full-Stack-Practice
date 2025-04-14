//Parameter method
import java.util.*;
public class meth8 {
    void rev(int no)
    {
        int rev;
        while(no>0)
        {
            rev=no%10;
            System.out.print(rev);
            no=no/10;
        }
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int x;
    System.out.println("Enter a Number : ");
    x=sc.nextInt();
    meth8 pp=new meth8();
    pp.rev(x);    
    }
}
