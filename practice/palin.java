// public class palin {
//     public static void main(String[] args) {
//         int no,rem,sum=0,no1;
//         no=Integer.parseInt(args[0]);
//         no1=no;
//         while(no1>0){
//             rem=no1%10;
//             sum=sum*10+rem;
//             no1=no1/10;
//         }
//         if(sum==no){
//             System.out.println("Palindrome.");
//         }
//         else{
//             System.out.println("Not a Palindrome.");
//         }
        
//     }
    
// }

import java.util.*;

public class palin {
    public static void main(String[] args) {
        int no,no1,sum=0,rem;

        Scanner sc=new Scanner(System.in);
        System.out.println("ennter a number");
        no=sc.nextInt();
        no1=no;

        while (no1>0) {
            rem=no1%10;
            // sum=sum+rem;
            sum=sum*10+rem;
            no1=no1/10;
            
        }
        // System.out.println(sum);
        if(sum==no)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrrome");
        }
    }
}