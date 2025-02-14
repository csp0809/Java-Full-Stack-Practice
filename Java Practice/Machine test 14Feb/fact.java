import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        int a,b=1,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("No:");
        a = sc.nextInt();
        for (i=1;i<=a;i++)
        {
            b = b*i;
        }
        System.out.println("Factorial is : " +b);
    }
}
