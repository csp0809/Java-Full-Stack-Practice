import java.util.*;
public class retvopal {
    String palin()
    {
        int no,rem,no1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        no=sc.nextInt();
        no1=no;

        while (no1>0) {
            rem=no1%10;
            sum=sum*10+rem;
            no1=no1/10;
        }
        if(sum==no)
        {
            return "Palindrome";
        }
        else{
            return "Not Palindrome";
        }
    }
    public static void main(String[] args) {
        retvopal p=new retvopal();
        String x=p.palin();
        System.out.println(x);
    }
}
