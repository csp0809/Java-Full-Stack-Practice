import java.util.*;
public class meth5 {
    void fac()
    {
        int a,b=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = sc.nextInt();

        for (i=1;i<=a;i++)
        {
            b = b*i;
        }
        System.out.println("Factorial is : " +b);
    }
    public static void main(String[] args) {
        meth5 obj=new meth5();
        obj.fac();
    }
}
