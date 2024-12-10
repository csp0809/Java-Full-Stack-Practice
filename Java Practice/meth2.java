import java.util.*;
public class meth2 {
    void palin()
    {
        int no,rem,sum=0,no1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        no=sc.nextInt();
        no1=no;

        while(no1>0){
            rem=no1%10;
            sum=sum*10+rem;
            no1=no1/10;
        }
        if(sum==no){
            System.out.println("Palindrome.");
        }
        else{
            System.out.println("Not a Palindrome.");
        }
    }
    public static void main(String[] args) {
        meth2 obj= new meth2();
        obj.palin();
    }
}
