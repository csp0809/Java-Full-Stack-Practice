import java.util.Scanner;

public class TestRev {
    public static void main(String[] args) {
        int no,rev;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Num");
        no=sc.nextInt();

        while (no>0) {
            rev=no%10;
            System.out.print(rev);
            no=no/10;
        }
    }
}
