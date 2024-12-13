import java.util.Scanner;

public class Testfact {
    public static void main(String[] args) {
        int a,b=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        a=sc.nextInt();
        while (a>1) {
            b=b*a;
            a--;
        }
        System.out.println(b);
    }
    
}
