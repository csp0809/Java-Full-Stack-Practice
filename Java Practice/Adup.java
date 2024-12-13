// Java Program to Remove Duplicate 
// Elements From the Array using Set
// import java.util.*;

// class Adup {

//     // Function to remove duplicate from array
//     public static void remove(int[] a)
//     {
//         LinkedHashSet<Integer> s
//             = new LinkedHashSet<Integer>();

//         // adding elements to LinkedHashSet
//         for (int i = 0; i < a.length; i++)
//             s.add(a[i]);

//         System.out.print(s);
//     }

//     public static void main(String[] args)
//     {
//         int a[] = {1, 2, 2, 3, 3, 4, 5};
    
//         // Function call
//         remove(a);
//     }
// }

// import java.util.*;

// class Adup {

    
//     public static void remove(int[] a)
//     {
//         LinkedHashSet<Integer> s
//             = new LinkedHashSet<Integer>();

       
//         for (int i = 0; i < a.length; i++)
//             s.add(a[i]);
//         System.out.print(s);
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {1, 2, 2, 3, 3, 4, 5};
//         remove(a);
//     }
// }

import java.util.*;
public class Adup {
    public static void remove(char[] a) {
        LinkedHashSet<Character> s=new LinkedHashSet<>();

        for(int i=0;i<a.length;i++){
            s.add(a[i]);
            
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        char []a={'a','a','b','c','d','d'};
        remove(a);
    }
}