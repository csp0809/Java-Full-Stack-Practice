/*
// Parameter Constructor Example
import java.util.*;
public class Number {
    int x,y;
    Number(int a,int b)
    {
        x=a;
        y=b;
    }
    void max()
    {
        if(x>y)
        {
            System.out.println(x+"is Max");
        }
        else
        {
            System.out.println(y+"is Max");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nos:");
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        Number obj=new Number(m, n);
        obj.max();
    }
}

*/

/*
// Parameter Constructor Example 2
import java.util.*;
public class PCE {
    int x;
    PCE(int a)
    {
        x=a;
    }
    void Posneg()
    {
        if(x>0)
        {
            System.out.println(x+" : Is Positive");
        }
        else
        {
            System.out.println(x+" : Is Negative");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int m;
        m=sc.nextInt();
        PCE obj=new PCE(m);
        obj.Posneg();
    }
}

*/

/*
// Parameter Constructor Example 3
import java.util.*;
public class PCE {
    int no;
    PCE(int a)
    {
        no=a;
    }

    void div()
    {
        if (no % 5 == 0 && no % 7 == 0 && no % 9 == 0)
        {
            System.out.println(no+" : is divisisble by 5,7 & 9");
        } 
        else
        {
            System.out.println(no+" : id not divisible by 5,7 & 9");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int m;
        m=sc.nextInt();
        PCE obj=new PCE(m);
        obj.div();
    }

}

*/

/* 
// Parameter Constructor Example 4
import java.util.*;
public class PCE {
    int no;
    PCE(int x)
    {
        no=x;
    }
    void eveodd()
    {
        if(no%2==0)
        {
            System.out.println(no+" : Is even");
        }
        else
        {
            System.out.println(no+" : Is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number.");
        int a=sc.nextInt();
        PCE obj=new PCE(a);
        obj.eveodd();
    }
}
*/

/* 
// Parameter Constructor Example 5
import java.util.*;
public class PCE {
    int sub1,sub2,sub3,t;
    PCE(int x,int y, int z)
    {
        sub1=x;
        sub2=y;
        sub3=z;
    }
    void avg()
    {
        int t= sub1+sub2+sub3;
        int a=t/3;
        System.out.println("Average is : "+a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Subject Marks :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        PCE obj=new PCE(a, b, c);
        obj.avg();

    }
}

*/


/* 
// Parameter Constructor Example 5
import java.util.*;

public class PCE {
    int a;
    PCE(int x)
    {
        a=x;
    }
    void pal()
    {
        int sum=0,rev;
        int a1=a;
        while (a1>0) {
            rev=a1%10;
            sum=sum*10+rev;
            a1=a1/10;
        }
        if(sum==a)
        {
            System.out.println(a+" : is Palindrome");
        }
        else
        {
            System.out.println(a+" : is not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter a number :");
        int d=c.nextInt();
        PCE o=new PCE(d);
        o.pal();
    }
}


*/

//parameter constructor

import java.util.*;

public class PCE {
    int a;
    PCE(int x)
    {
        a=x;
    }
    void Rev()
    {
        int sum=0,rev,a1;
        a1=a;
        while (a1>0) {
            rev=a1%10;
            sum=sum*10+rev;
            a1=a1/10;
            System.out.print(rev);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int d=sc.nextInt();
        PCE o=new PCE(d);
        o.Rev();
    }
}