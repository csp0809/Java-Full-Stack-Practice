import java.util.Scanner;

public class TestPal {
    public static void main(String[] args) {
        int no,no1,sum=0,rem;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        no=sc.nextInt();
        no1=no;

        while (no1>0) {
            rem=no1%10;
            sum=sum*10+rem;
            no1=no1/10;
        }
        if(sum==no){
            System.out.println("Num is Palindrome");
        }
        else{
            System.out.println("Num is Not Palindrome");
        }
    }
}
