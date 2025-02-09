//Parameter constructor

import java.util.Scanner;

public class ParaConst {
    int a;
    ParaConst(int x)
    {
        a=x;
    }
    void rev()
    {
        int a1,rev;
        a1=a;
        while (a1>0) {
            rev=a1%10;
            System.out.print(rev);
            a1=a1/10;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int d=sc.nextInt();
        ParaConst p=new ParaConst(d);
        p.rev();
    }
}
