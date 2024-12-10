//Parameter method
import java.util.*;
public class meth10 {
    void sumofdigits(int no)
    {
        int rem,sum=0;

        while(no>0)
        {
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a number :");
        x=sc.nextInt();
        meth10 pp=new meth10();
        pp.sumofdigits(x);
    }
}
