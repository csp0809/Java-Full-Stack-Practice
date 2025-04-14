
import java.util.Scanner;

public class Test2 {
    int a,b;
    Test2(int x, int y)
    {
        a=x;
        b=y;
    }
    void Range()
    {
        int i,sum=0;
        for(i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println("Sum of given Range is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos : ");
        int c=sc.nextInt();
        int d=sc.nextInt();
        Test2 p=new Test2(c,d);
        p.Range();
    }
    
}
