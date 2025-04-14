//Parameter method
import java.util.*;
public class meth11 {
    void sumofrange(int a, int b)
    {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            sum=sum+i;
        }
        System.err.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter Range : ");
        x=sc.nextInt();
        y=sc.nextInt();
        meth11 pp=new meth11();
        pp.sumofrange(x, y);
    }
}
