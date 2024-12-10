//return void priime number
/* 
import java.util.*;
public class retvoidprime {
    String prime()
    {
        int no,flag=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        no=sc.nextInt();

        for (i=2;i<no;i++) {
            if(no%i==0)
            {
                flag=1;
                break;
            }
        }
        if (flag==0) {
            return "Prime no";
        }
        else {
            return "Not prime";
        }
    }
    public static void main(String[] args) {
        retvoidprime p= new retvoidprime();
        String x=p.prime();
        System.out.println(x);
    }
}

*/

import java.util.*;

public class retvoidprime {
    String prime()
    {
        int no,i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        no=sc.nextInt();
        
        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            {
                return "Prime";
            }
            else
            {
                return "Not Prime";
            }
    }
    public static void main(String[] args) {
        retvoidprime p=new retvoidprime();
        String x=p.prime();
        System.out.println(x);
    }
}
