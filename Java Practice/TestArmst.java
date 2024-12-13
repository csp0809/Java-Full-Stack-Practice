import java.util.Scanner;

public class TestArmst {
    public static void main(String[] args) {
        int rem,sum=0,no,no1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        no=sc.nextInt();

        no1=no;
        while (no1>0) {
            rem=no1%10;
            sum=sum+rem*rem*rem;
            no1=no1/10;
        }
        if(sum==no){
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
