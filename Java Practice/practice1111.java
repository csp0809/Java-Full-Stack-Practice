// import java.util.Scanner;

// public class practice1111 {
//     public static void main(String args[]){
//         int no,i,flag=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a Number: ");
//         no=sc.nextInt();

//         for(i=2;i<no;i++)
//         {
//             if(no%i==0)
//             {
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag==0)
//         {
//             System.out.println("prime");
//         }
//         else
//         {
//             System.out.println("not");
//         }
//     }
// }

import java.util.Scanner;

public class practice1111 {
    public static void main(String[] args) {
        int no, i,flag=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number:");
        no=sc.nextInt();

        for(i=2;i<no;i++){
            if(no%i==0)
            {
                flag=1;
                break;
            }

        }
        if (flag==0) {
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }
    }
}