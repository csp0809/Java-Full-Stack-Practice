import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        int a=0,b=1,c,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("no: ");
        no=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        while (no>0) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            no--;
        }
    }
}