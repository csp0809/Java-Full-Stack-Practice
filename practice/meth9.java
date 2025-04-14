//Parameter method
import java.util.*;
public class meth9 {
    void prime(int no)
    {
        int i,flag=0;
        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                flag=1;
                break;
            }

        }
        if(flag==0)
        System.out.println("Prime Number");
        else
        System.out.println("Not a Prime Number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter a number : ");
        x=sc.nextInt();
        meth9 pp=new meth9();
        pp.prime(x);
    }
}
