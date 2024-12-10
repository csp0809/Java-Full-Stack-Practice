import java.util.*;
public class meth {
    void addition()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter 2 nos");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.err.println("addition: "+c);
    }
    public static void main(String[] args) {
        meth pp = new meth();
        pp.addition();
    }
}
