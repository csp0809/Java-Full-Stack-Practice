import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        int no,rem,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("no:");
        no = sc.nextInt();
        while(no>0)
        {
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        System.out.print(sum);
    }
}
