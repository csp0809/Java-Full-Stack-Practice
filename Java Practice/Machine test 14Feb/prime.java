import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        int no,i,flag=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no");
        no=sc.nextInt();

        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                flag=1;
            }
        }
        if (flag==0) {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }

    }
}