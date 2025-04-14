import java.util.*;
public class d2 {
    public static void main(String[] args) {
        int no[][]= new int[2][3];
        no[0][0]=10;
        no[0][1]=20;
        no[0][2]=30;
        no[1][0]=40;
        no[1][1]=50;
        no[1][2]=60;

        int i,j;
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.println(no[i][j]);
            }
        }
    }
}
