/* 
public class strpal {
    public static void main(String[] args) {
        String original,reverse="";

        original=args[0];
        int length=original.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse))
        {
            System.out.println("Entered String/Number is Palindrome.");
        }
        else
        {
            System.out.println("Entered String/Number is Not Palindrome.");
        }
    }
}

*/

// import java.util.*;

// public class strpal {
//     public static void main(String[] args) {
        
//         String og,rev="";
//         Scanner c=new Scanner(System.in);
//         System.out.println("Enter a String");
//         og=c.nextLine();

//         int length=og.length();

//         for(int i=length-1;i>=0;i--)
//         {
//             rev=rev+og.charAt(i);
//         }
//         if(rev.equals(og))
//         {
//             System.out.println("palindrome");
//         }
//         else
//         {
//             System.out.println("not palindrome");
//         }
//     }
// }


import java.util.*;

public class strpal {
    public static void main(String[] args) {
        String og,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        og=sc.next();

        int length=og.length();

        for(int i=length-1;i>=0;i--){
            rev=rev+og.charAt(i);
        }
        if(og.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}