/* 
public class vow {
    public static void main(String[] args) {
        int count=0;

        String sentence=args[0]; // only single word without space is considered by string while using args/Scanner class.

        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if(ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        System.out.println("Number of Vowels in given Sentence is : "+count);
    }
}

*/
// import java.util.*;
// public class vow {
//     public static void main(String[] args) {
//         int count=0;
//         Scanner c=new Scanner(System.in);
//         System.out.println("ENter a sentence.");
//         String sen=c.nextLine();

//         int length=sen.length();

//         for(int i=0;i<length;i++)
//         {
//             char ch=sen.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//             {
//                 count++;
//             }
//         }
//         System.out.println("Number of vowels in the sentence are : "+count);
//     }
// }

// import java.util.*;
// class Pract
// {
//     public static void main(String[] args) {
//         int count=0;

//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a sentence");
//         String sen=sc.nextLine();

        
//         for(int i=0;i<sen.length();i++)
//         {
//             char ch=sen.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//             {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

import java.util.*;

public class vow {
    public static void main(String[] args) {
        int count=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sen");
        String sen=sc.nextLine();

        for(int i=0;i<sen.length();i++){
            char ch=sen.charAt(i);
            if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u' || ch== 'A' || ch== 'E' || ch== 'I' || ch== 'O' || ch== 'U'){
                count++;
            }
        }
        System.out.println(count);
    }
}