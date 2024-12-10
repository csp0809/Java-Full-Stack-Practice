import java.util.*;
public class meth4 {
    void fibo()
    {
        int a=0,b=1,c,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        no=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        while(no>0){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            no--;
        }
    }
    public static void main(String[] args) {
        meth4 obj=new meth4();
        obj.fibo();
    }

}
