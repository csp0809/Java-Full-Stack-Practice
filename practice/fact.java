// class fact
// {
//     public static void main (String args[])
//     {
//         int a,b;
//         a = Integer.parseInt (args[0]);
//         b = 1;
//         while (b <= a)
//         {
//             b *= a;
//             a--;
//         }
//         {
//             System.out.println("Factorial is: "+ b);
//         }
//     }
// }


// import java.util.*;

// public class fact {

//     public static void main(String[] args) {
//         int a,b=1;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter a number");
//     a=sc.nextInt();

//     while(a>=1){
//         b =b*a;
//         a--;
//     }
//     System.out.println(b);
//     }
// }

import java.util.*;

public class fact {

    public static void main(String[] args) {
        int a,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        a=sc.nextInt();

        while(a>=1){
            b=b*a;
            a--;
        }
        System.out.println(b);
    }
}