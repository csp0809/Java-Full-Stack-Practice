// import java.util.Scanner;

// public class rev {
//     public static void main(String[] args) {
//         int no,rem;
//         Scanner sc= new Scanner(System.in);
//         System.out.println("no:");
//         no = sc.nextInt();
//         while(no>0)
//         {
//             rem=no%10;
//             System.out.print(rem);
//             no=no/10;
//         }
//     }
    
// }

import java.util.Scanner;

public class rev {

    public static void main(String[] args) {
        int no,rem,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        no=sc.nextInt();

        while (no>0) {
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }
}