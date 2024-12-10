import java.util.*;
public class ParaMeth {
    void Rev(int x)
    {
        int sum=0,rev,x1=x;
        while(x1>0)
        {
            rev=x1%10;
            sum=sum*10+rev;
            x1=x1/10;
            System.out.print(rev);
        }
        
    }
    public static void main(String[] args) {
        ParaMeth p=new ParaMeth();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a=sc.nextInt();
        p.Rev(a);
    }
}