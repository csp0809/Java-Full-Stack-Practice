// public class fibo {
//     public static void main(String[] args) {
//         int a=0,b=1,c,no;
//         System.out.println(a);
//         System.out.println(b);
//         no=Integer.parseInt(args[0]);

//         while(no>0){
//             c=a+b;
//             System.out.println(c);
//             a=b;
//             b=c;
//             no--;
//         }
//     }    
// }


import java.util.*;

public class fibo {
    public static void main(String[] args) {
        int a=0,b=1,c,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num");
        no=sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        while (no>0) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            no--;
        }
    }
}