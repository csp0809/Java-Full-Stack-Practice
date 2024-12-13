//Prime no
import java.util.*;

public class TestPrime {
    public static void main(String[] args) {
        int no,i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        no=sc.nextInt();

        for(i=2;i<no;i++){
            if(no%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
