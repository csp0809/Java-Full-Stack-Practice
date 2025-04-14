/* 
//return parameter method Prime number
import java.util.*;
public class retparaprime {
    String prime(int no)
    {
        int i,flag=0;
        for(i=2;i<no;i++)
        {
            if(no%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return "Prime";
        }
        else{
        return "Not prime";
        }
    }
    public static void main(String[] args) {
        retparaprime p=new retparaprime();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        String st=p.prime(x);
        System.out.println(st);
    }
}

*/

//return parameter method Prime number
import java.util.*;

public class retparaprime {
    String prime(int no)
    {
        int i,flag=0;

        for(i=2;i<no;i++){
            if(no%2==0)
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int x=sc.nextInt();
        retparaprime p=new retparaprime();
        String st=p.prime(x);
        System.out.println(st);
    }
}