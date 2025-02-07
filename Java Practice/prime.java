// public class prime {
//     public static void main(String[] args) {
//         int no,i,flag=0;
//         no = Integer.parseInt(args[0]);
//         for(i=2;i<no;i++)
//         {
//             if(no%i==0)
//             {
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag==0)
//         System.out.println("Prime Number");
//         else
//         System.out.println("Not a Prime Number");
//     }
    
// }

import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        int no,i,flag=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter a number:");
        no=sc.nextInt();

        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                flag=1;
                break;
            }
            
        }
        if(flag==0)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
    }
}

