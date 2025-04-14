// Parameter Constructor Example
import java.util.*;
public class Number {
    int x,y;
    Number(int a,int b)
    {
        x=a;
        y=b;
    }
    void max()
    {
        if(x>y)
        {
            System.out.println(x+"is Max");
        }
        else
        {
            System.out.println(y+"is Max");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nos:");
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        Number obj=new Number(m, n);
        obj.max();
    }
}
