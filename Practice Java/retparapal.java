import java.util.*;
public class retparapal {
    String pal(int no)
    {
        int no1,rem,sum=0;
        no1=no;
        while (no1<0) {
            rem=no1%10;
            sum=sum*10+rem;
            no1=no1%10;
        }
        if(sum==no)
        {
            return "Palindrome";
        }
        else
        {
            return "Not Palindrome";
        }
    }
    public static void main(String[] args) {
        retparapal p=new retparapal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int x=sc.nextInt();
        String s=p.pal(x);
        System.out.println(s);
    }
}
