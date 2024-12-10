// public class armst {
//     public static void main(String[] args) {
//         int no,rem,sum=0,no1;
//         no=Integer.parseInt(args[0]);
//         no1=no;
//         while(no1>0){
//             rem=no1%10;
//             sum=sum+rem*rem*rem;
//             no1=no1/10;
//         }
//         if(sum==no){
//             System.out.println("Armstrong number.");
//         }
//         else{
//             System.out.println("Not an Armstrong number.");
//         }
        
//     }
    
// }


import java.util.*;

public class armst {

    public static void main(String[] args) {
        int no,no1,rem,sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        no=sc.nextInt();
        no1=no;
        while (no1>0) {
            rem=no1%10;
            sum=sum+rem*rem*rem;
            no1=no1/10;
        }
        if(sum==no)
        {
            System.out.println("Armstrong ");
        }
        else
        {
            System.out.println("Not Armstrong ");
        }
    }
}