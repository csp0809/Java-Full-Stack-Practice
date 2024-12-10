import java.util.*;
public class retpara {
    String check(int no)
    {
        int sum=0,no1,rev;
        no1=no;
        while (no1>0) {
            rev=no1%10;
            sum=sum*10+rev;
            no1=no1/10;
        }
        if(sum==no){
            return "Palindrome";
        }
        else{
        return "Not palindrome";
        }
    }
    public static void main(String[] args)
    {    
        retpara pp=new retpara();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        String str=pp.check(a);
        System.out.println(str);
        
    }
}
