// Default constructor
import java.util.Scanner;

public class Dconst {
    Dconst()
    {
        int r;
        double a;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter radious : ");
        r=sc.nextInt();
        a=3.14*r*r;
        System.out.println("Area of CIrcle is: "+a);

    }
    public static void main(String[] args) {
        Dconst d= new Dconst();
    }
}
