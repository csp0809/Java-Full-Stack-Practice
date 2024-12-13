import java.util.Scanner;

public class TestAsc {
    public static void main(String[] args) {
        int no[]=new int[5];
        int temp=0;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter a number");
            no[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
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
