// Java Program to Remove Duplicate 
// Elements From the Array using Set
import java.util.*;

class Adup {

    // Function to remove duplicate from array
    public static void remove(int[] a)
    {
        LinkedHashSet<Integer> s
            = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            s.add(a[i]);

        System.out.print(s);
    }

    public static void main(String[] args)
    {
        int a[] = {1, 2, 2, 3, 3, 4, 5};
    
        // Function call
        remove(a);
    }
}