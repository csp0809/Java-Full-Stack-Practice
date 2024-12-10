//Parameter method
import java.util.*;
public class meth7 {
    void addition(int a, int b)
    {
        int c= a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter 2 Numbers: ");
        x=sc.nextInt();
        y=sc.nextInt();
        meth7 pp=new meth7();
        pp.addition(x, y); //pp.addition(2,9);
    }
}
