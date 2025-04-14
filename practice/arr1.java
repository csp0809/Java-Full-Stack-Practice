import java.util.*;
public class arr1 {
    public static void main(String[] args) {
        int no[]=new int[5];
        int i;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.println("Enter no :");
            no[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println("Output : "+no[i]); 
        }
    }
}
