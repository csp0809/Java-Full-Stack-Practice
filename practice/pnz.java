import java.util.*;
public class pnz {
    public static void main(String[] args) {
        int pos,neg,zer,i;
        pos=neg=zer=0;
        int no[]=new int[10];
        Scanner sc= new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("Enter no :");
            no[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            if(no[i]>0)
            pos++;
            else if(no[i]<0)
            neg++;
            else
            zer++;
        }
        System.out.println("Count of Positive Numbers :"+pos);
        System.out.println("Count of Negative Numbers :"+neg);
        System.out.println("Count of Zeros :"+zer);
    }
}
