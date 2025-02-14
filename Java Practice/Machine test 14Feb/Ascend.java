// import java.util.*;
// public class Ascend {

//     public static void main(String[] args) {
//         int no[]=new int[5];
//         int i,j,temp=0;
//         Scanner sc=new Scanner(System.in);
//         for(i=0;i<5;i++){
//             System.out.println("enter no");
//             no[i]=sc.nextInt();
//             System.out.println();
//         }
//         for(i=0;i<5;i++){
//             for(j=i+1;j<5;j++){
//                 if(no[i]>no[j]){
//                     temp=no[i];
//                     no[i]=no[j];
//                     no[j]=temp;
//                 }
//             }
//             System.out.println(no[i]);
//         }
        
//     }
// }

// import java.util.*;

// public class Ascend {

//     public static void main(String[] args) {
//         int no[]=new int[5];
//         int i,j,temp=0;

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 5 nos: ");
//         for(i=0;i<5;i++)
//         {
            
//             no[i]=sc.nextInt();
//             System.out.println();
//         }
//         for(i=0;i<5;i++)
//         {
//             for(j=i+1;j<5;j++)
//             {
//                 if(no[i]>no[j])
//                 {
//                     temp=no[i];
//                     no[i]=no[j];
//                     no[j]=temp;
//                 }
//             }
//             System.out.println(no[i]);
//         }

//     }
// }

import java.util.Scanner;

public class Ascend {

    public static void main(String[] args) {
        int no[]=new int[5];
        int i,j,temp=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("5 nos:");
        for(i=0;i<5;i++)
        {
            no[i]=sc.nextInt();
            System.out.println();
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(no[i]>no[j])
                {
                    temp=no[i];
                    no[i]=no[j];
                    no[j]=temp;
                }
            }
            System.out.println(no[i]);
        }
    }
}