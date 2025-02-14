import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int no,no1,rem,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("no:");
        no = sc.nextInt();
        no1=no;
        while(no1>0)
        {
            rem=no1%10;
            sum=sum*10+rem;
            no1=no1/10;
        }
        if(sum==no){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOt Palindrome");
        }
    }
}

