import java.util.Scanner;

public class arif {
    public static void main(String[] args) {
        int i,pos = 0,nev=0,zero=0;

        int no[] = new int[10];

        Scanner sc = new Scanner(System.in);

       for(i = 0;i<10;i++){

        System.out.println("Enter a number:");
        no[i] = sc.nextInt();


       }


       for(i = 0; i<no.length;i++){
        if(no[i]>0){
            pos++;
        }

        else if(no[i]<0){
            nev++;
        }

        else{

            zero++;
        }



       }


       System.out.println("Count of postive number"+pos);
       System.out.println("Count of Negative number"+nev);
       System.out.println("Count of Zero number"+zero);
    }
}
