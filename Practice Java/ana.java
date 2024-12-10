// import java.util.*;

// public class ana {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         String s1,s2;
//         System.out.println("Enter two Strings :");
//         s1=s.nextLine();
//         s2=s.nextLine();

//         String copys1= s1.replaceAll("s", "");
//         String copys2= s2.replaceAll("s", "");

//         boolean status = true;
//         if(copys1.length() != copys2.length())
//         {
//             status =false;
//         }
//         else
//         {
//             char[] s1Array= copys1.toLowerCase().toCharArray();
//             char[] s2Array=  copys2.toLowerCase().toCharArray();

//             Arrays.sort(s1Array);
//             Arrays.sort(s2Array);

//             status = Arrays.equals(s1Array, s2Array);
//         }
//         if(status==true)
//         {
//             System.out.println(s1+" and "+s2+" Are Anagrams.");
//         }
//         else
//         {
//             System.out.println(s1+" and "+s2+" Are Not Anagrams.");
//         }
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// class ana
// {
//     public static void main(String[] args) {
//         String s1,s2;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter two strings : ");
//         s1=sc.next();
//         s2=sc.next();

//         String copys1= s1.replaceAll("s", "");
//         String copys2= s2.replaceAll("s", "");

//         boolean status= true;

//         if(copys1.length() != copys2.length())
//         {
//             status =false;
//         }
//         else
//         {
//             char [] s1array= copys1.toLowerCase().toCharArray();
//             char [] s2array= copys2.toLowerCase().toCharArray();

//             Arrays.sort(s1array);
//             Arrays.sort(s2array);

//             status=Arrays.equals(s1array, s2array);

//             if(status==true)
//             {
//                 System.out.println("anagram");
//             }
//             else{
//                 System.out.println("not anagram");
//             }
//         }
//     }
// }

// import java.util.*;

// public class ana {
//     public static void main(String[] args) {
//         String s1, s2;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 2 Strings");
//         s1 = sc.next();
//         s2 = sc.next();

//         String copys1 = s1.replaceAll("s", "");
//         String copys2 = s2.replaceAll("s", "");

//         boolean status = true;
//         if (copys1.length() != copys2.length()) {
//             status = false;
//         } else {
//             char[] s1array = copys1.toLowerCase().toCharArray();
//             char[] s2array = copys2.toLowerCase().toCharArray();

//             Arrays.sort(s1array);
//             Arrays.sort(s2array);

//             status = Arrays.equals(s1array, s2array);

//             if (status == true) {
//                 System.out.println("anagram");
//             } else {
//                 System.out.println("not ");
//             }
//         }

//     }
// }

import java.lang.reflect.Array;
import java.util.*;

public class ana{
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        s1=sc.next();
        s2=sc.next();

        String copys1=s1.replaceAll("s","");
        String copys2=s2.replaceAll("s", "");

        boolean status= true;

        if(copys1.length() !=copys2.length())
        {
            status=false;
        }
        else
        {
            char [] s1array= copys1.toLowerCase().toCharArray();
            char [] s2array= copys2.toLowerCase().toCharArray();

            Arrays.sort(s1array);
            Arrays.sort(s2array);

            status=Arrays.equals(s1array, s2array);
            if(status==true){
                System.out.println("anagram");
            }
            else{
                System.out.println("not");
            }
        }
    }
}