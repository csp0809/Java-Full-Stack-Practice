/* //Default Constructor/ void constructor Example 1
import java.util.*;
public class DCE {
    int x,y;
    DCE()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    void max()
    {
        if(x>y)
        {
            System.out.println(x+" Is max");
        }
        else{
            System.out.println(y+" Is max");
        }
    }
    public static void main(String[] args) {
        DCE p=new DCE();
        p.max();
    }    
}

*/

/* 
//Default Constructor/ void constructor Example 2
import java.util.*;
public class DCE {
    int x;
    DCE()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        x=sc.nextInt();
    }
    void posneg()
    {
        if(x>0)
        {
            System.out.println(x+" : is postive.");
        }
        else{
            System.out.println(x+" : is negative.");
        }
    }
    public static void main(String[] args) {
        DCE p=new DCE();
        p.posneg();
    }
}

*/
/* 
//Default Constructor/ void constructor Example 3
import java.util.*;
public class DCE {
    int no;
    DCE()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        no=sc.nextInt();
    }
    void div()
    {
        if(no%5==0 && no%7==0)
        {
            System.out.println(no+" : is divisible by 5&7");
        }
        else
        {
            System.out.println(no+" : is not divisible by 5&7");
        }
    }
    public static void main(String[] args) {
        DCE o=new DCE();
        o.div();
    }
}

*/

/* 
//Default Constructor/ void constructor Example 3
import java.util.*;
public class DCE {
    int no;
    DCE()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        no=sc.nextInt();

    }
    void eveodd()
    {
        if(no%2==0)
        {
            System.out.println(no+" : is Even");
        }
        else
        {
            System.out.println(no+" : is Odd");
        }
    }
    public static void main(String[] args) {
        DCE p=new DCE();
        p.eveodd();
    }
}
*/

/* 
//Default Constructor/ void constructor Example 4
import java.util.*;
public class DCE {
    int sub1,sub2,sub3;
    DCE()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Subjects :");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();
    }
    void avg()
    {
        int a=(sub1+sub2+sub3)/3;
        System.out.println("Average is : "+a);
    }
    public static void main(String[] args) {
        DCE b= new DCE();
        b.avg();
    }
}

*/

//Default Constructor/ void constructor Example 4

import java.util.*;

public class DCE {
    int a;
    DCE()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        a=sc.nextInt();
    }
    void arm()
    {
        int sum=0,rem,a1=a;
        while(a1>0)
        {
            rem=a1%10;
            sum=sum+rem*rem*rem;
            a1=a1/10;
        }
        if(sum==a)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println(" Not Armstrong number");
        }
    }
    
    public static void main(String[] args) {
        DCE p=new DCE();
        p.arm();
    }

}