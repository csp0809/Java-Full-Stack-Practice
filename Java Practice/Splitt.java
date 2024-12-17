// // java program to split an alphanumeric  
// // string using Stringbuffer  
// class Splitt  
// {  
// static void splitString(String str)  
//     {  
// StringBuffer alpha = new StringBuffer(),   
//         num = new StringBuffer(), special = new StringBuffer();  
//         for (int i=0; i<str.length(); i++)  
// {  
//             if (Character.isDigit(str.charAt(i)))  
//                 num.append(str.charAt(i));  
// else if(Character.isAlphabetic(str.charAt(i)))  
//                 alpha.append(str.charAt(i));  
// else  
//                 special.append(str.charAt(i));  
//         }  
// System.out.println(alpha);  
// System.out.println(num);  
// System.out.println(special);  
//  }  
//  // Driver method  
// public static void main(String args[])  
//     {  
// String str = "Java234T567point890@#!!";  
// splitString(str);  
// }  
// }  

// import java.util.*;

// public class Splitt {
//     public static void main(String[] args) {
//         String str;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string");
//         str=sc.nextLine();
//         char [] s=str.toCharArray();

//         for(int i=0;i<str.length();i++){
//             if()
//         }
//     }

// }

// import java.util.*;

// public class Splitt {
//     static  void splitString(String str){
//         StringBuilder  alpha=new StringBuilder();
//         StringBuilder num=new StringBuilder();
//         StringBuilder special=new StringBuilder();
    
//             for(int i=0;i<str.length();i++){
//                 if(Character.isDigit(str.charAt(i)))
//                 num.append(str.charAt(i));

//                 else if(Character.isAlphabetic(str.charAt(i)))
//                 alpha.append(str.charAt(i));

//                 else
//                 special.append(str.charAt(i));
//             }
//             System.out.println(num);
//             System.out.println(alpha);
//             System.out.println(special);
//     }

//     public static void main(String[] args) {

//         String str;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string");
//         str = sc.nextLine();

//         splitString(str);
//     }
// }

import java.util.*;

public class Splitt {

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.next();

        StringBuilder alpha=new StringBuilder();
        StringBuilder num=new StringBuilder();
        StringBuilder special=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                alpha.append(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))){
                num.append(s.charAt(i));
            }
            else{
                special.append(s.charAt(i));
            }

            System.out.println(alpha);
            System.out.println(num);
            System.out.println(special);
        }
    }
}