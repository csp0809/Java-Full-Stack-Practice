import java.util.Scanner;

public class TestSumofDigits {
    public static void main(String[] args) {
        int no,rem,sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        no=sc.nextInt();

        while (no>0) {
        rem=no%10;
        sum=sum+rem;
        no=no/10;            
        }
        System.out.println(sum);
    }
}
