// import java.util.Scanner;

// public class Arm {
//     public static void main(String[] args) {
//         int no,no1,rem,sum=0;

//         Scanner sc= new Scanner(System.in);
//         System.out.println("no:");
//         no=sc.nextInt();
//         no1=no;
//         while (no1>0) {
//             rem=no1%10;
//             sum=sum+rem*rem*rem;
//             no1=no1/10;
//         }
//         if(sum==no)
//         {
//             System.out.println("armstrong");
//         }
//         else{
//             System.out.println("not armstrong");
//         }
//     }
// }

import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        int no,no1,rem,sum=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("no:");
        no=sc.nextInt();
        no1=no;
        while (no1>0) {
            rem=no1%10;
            sum=sum+rem*rem*rem;
            no1=no1/10;
        }
        if(sum==no)
        {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}