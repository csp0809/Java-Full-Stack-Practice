import java.util.*;
public class meth3 {
    void armst()
    {
        int no,rem,sum=0,no1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        no=sc.nextInt();
        no1=no;

        while(no1>0){
            rem=no1%10;
            sum=sum+rem*rem*rem;
            no1=no1/10;
        }
        if(sum==no){
            System.out.println("Armstrong number.");
        }
        else{
            System.out.println("Not an Armstrong number.");
        }
    }
    public static void main(String[] args) {
        meth3 obj=new meth3();
        obj.armst();
    }
}
