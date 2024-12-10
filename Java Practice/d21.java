import java.util.*;
public class d21 {
    public static void main(String[] args) {
        int i,j;
        int no[][]= new int[2][3];
        Scanner sc =new Scanner(System.in);

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.println("Enter no : ");
                no[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(" "+no[i][j]);
            }
            System.out.println();
        }
    }
}
