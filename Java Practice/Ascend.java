import java.util.*;
public class Ascend {
    public static void main(String[] args) {
        int no[]=new int[5];
        int i,j,temp=0;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.println("Enter no :");
            no[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++){
                if(no[i]>no[j]){
                temp=no[i];
                no[i]=no[j];
                no[j]=temp;
            }
        }
        System.out.println(no[i]);
    }
    }
    
}

