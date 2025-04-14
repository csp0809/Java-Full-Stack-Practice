import java.util.*;
public class d22 {
    public static void main(String[] args) {
        int no[][] = new int[3][5];
        int i,j;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<3;i++){
            System.out.println("Enter Roll no :");
            no[i][0] =sc.nextInt();
            System.out.println("Enter 3 subject marks :");
            no[i][1]= sc.nextInt();
            no[i][2]= sc.nextInt();
            no[i][3]= sc.nextInt();
            no[i][4]= no[i][1]+no[i][2]+no[i][3];

        }
        for(i=0;i<3;i++){
            for(j=0;j<5;j++){
                System.out.print(no[i][j]+" |");
            }
            System.out.println();
        }
        
    }
}
