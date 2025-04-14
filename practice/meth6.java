import java.util.*;
public class meth6 {
    void rev()
    {
        int rem,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        no=sc.nextInt();

        while(no>0)
        {
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }
    public static void main(String[] args) {
        meth6 obj=new meth6();
        obj.rev();
    }
}
