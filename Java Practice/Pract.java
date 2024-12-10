/*public class Pract {
    public static void main(String[] args) {
        int code;
        code = Integer.parseInt(args[0]);
        if (code==2323)
        {
            System.out.println("Correct Code . Door will open now !");
        }
        else{
            System.out.println("Incorrect code. The door remains closed!");
        }
    }
    
}
*/

/*public class Pract {
    public static void main(String[] args) {
        int myNum = Integer.parseInt(args[0]);
        if(myNum<0){
            System.out.println("Number is Negative");
        }
        else if(myNum >0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is 0");
        }
    }
}
*/

/*public class Pract {
    public static void main(String[] args) {
        int myNum = Integer.parseInt(args[0]);
        if(myNum%2==0){
            System.out.println(myNum+": is Even.");
        }
        else{
            System.out.println(myNum+": is Odd.");
        }
    }
}
*/

/*public class Pract {
    public static void main(String[] args) {
        String name = args[0];
        int id= Integer.parseInt(args[1]);
        double fees= Double.parseDouble(args[2]);

        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Fees : "+fees);
    }
}
*/
//take 2 nos and print addition:
/*public class Pract {
    public static void main(String args[]){
    int a,b,sum;
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
    sum = a+b;
    System.out.println("Addition : "+sum);
    }
}
*/

//take radious and print area of circle.
/*public class Pract {
    public static void main(String args[]){
        double r,a;
        r=Double.parseDouble(args[0]);
        a= 3.14*r*r;
        System.out.println("Area of Circle : "+a);

    }
}
*/

//Accpet length and bredth and calculate area of Rectangle
/*public class Pract {
    public static void main(String args[]){
        double l,b,a;
        l=Double.parseDouble(args[0]);
        b=Double.parseDouble(args[1]);
        a=l*b;
        System.out.println("Area of Rectangle : "+a);

    }
}
*/

//Accept salary calculate DA HRA and Gross
/*public class Pract {
    public static void main(String args[]){
        double sal,da,hra,gross;
        sal=Double.parseDouble(args[0]);
        da=sal*5/100;
        hra=sal*10/100;
        gross=sal+da+hra;
        System.out.println("DA : "+da);
        System.out.println("HRA : "+hra);
        System.out.println("Gross : "+gross);
    }
}
*/

//Accept no and check if its even or odd
/*public class Pract {
    public static void main(String args[]){
        int no=Integer.parseInt(args[0]);
        if(no%2==0){
            System.out.println(no+" : Is Even number");
        }
        else {
            System.out.println(no+" : Is Odd number");
        }
    }
}
    */

//Positive or Negative number
/*public class Pract {
    public static void main(String[] args) {
        int no=Integer.parseInt(args[0]);
        if(no>0){
            System.out.println(no+" :Is Positive.");
        }
        else{
            System.out.println(no+" :Is Negative.");
        }
    }
}
*/

//Accept no and check if its diivisible by 5,7,9
/*public class Pract{
    public static void main(String args[]){
        int no=Integer.parseInt(args[0]);
        if(no%5==0 && no%7==0 && no%9==0){
            System.out.println(no+" : Is Divisible by 5,7,9.");
        }
        else{
            System.out.println(no+" : Is not Divisible by 5,7,9.");
        }
    }
}
*/

//Accept 2 nos and find bigger number
/*public class Pract {
    public static void main(String args[]){
        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        if(a>b){
            System.out.println(a+" : Is bigger number");   
        }
        else{
            System.out.println(b+" : Is bigger number");
        }
    }
}
*/

//Accept marks of 3 subjects and calculate total,avg and grade.
/*public class Pract {
    public static void main(String args[]) {
        int sub1,sub2,sub3,tot;
        double avg;
        sub1=Integer.parseInt(args[0]);
        sub2=Integer.parseInt(args[1]);
        sub3=Integer.parseInt(args[2]);

        tot=sub1+sub2+sub3;
        System.out.println("Total marks :"+tot);

        avg=tot/3;
        System.out.println("Average is : "+avg);

        if(avg>=75){
            System.out.println("Distinction.");
        }
        else if(avg>=60){
            System.out.println("First Class.");
        }
        else if(avg>=45){
            System.out.println("Second class.");
        }
        else if(avg>=35){
            System.out.println("PASS.");
        }
        else{
            System.out.println("FAIL!.");
        }
    }
}
    */

//Accept 3 sides of Triangle and check if its Equilateral, Isosceles or Scalar.
/*public class Pract {
    public static void main(String args[]){
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        if(a==b && b==c && c==a){
            System.out.println("Equilateral Triangle");
        }
        else if (a==b || b==c || c==a){
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalar Triangle");
        }
    }
}
*/

//Accept age and print appropriate message
/*public class Pract {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        if(a>=60){
            System.out.println("Senior Citizen");
        }
        else if(a>=45){
            System.out.println("Middle aged Citizen");
        }
        else if(a>=18){
            System.out.println("Adult Citizen");
        }
        else if(a>=12){
            System.out.println("Teenager Citizen");
        }
        else{
            System.out.println("Child");
        }
    }
}
*/

//Accept 2 nos and calculate additon, substraction, division, multiplication using switch case.
/*public class Pract {
    public static void main(String[] args) {
        int a,b,c,choice;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        choice=Integer.parseInt(args[2]);

        switch(choice){
            case 1:
            c=a+b;
            System.out.println(c);
            break;

            case 2:
            c=a-b;
            System.out.println(c);
            break;

            case 3:
            c=a*b;
            System.out.println(c);
            break;

            case 4:
            c=a/b;
            System.out.println(c);
            break;

            default :
            System.out.println("Please enter Valid choice.");
        }
    }
}
*/

//Accept month and print how many days it has.
/*public class Pract {
    public static void main(String args[]){
        String mnt= args[0];

        switch(mnt){
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
            System.out.println("31 Days.");
            break;

            case "feb":
            System.out.println("28 Days.");
            break;

            case "apr":
            case "jun":
            case "sep":
            case "nov":
            System.out.println("30 Days.");

            default:
            System.out.println("Please enter a valid choice!");
        }
    }
}
*/

//print 1-10 numbers using while loop
/*public class Pract {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
*/

//print 1-10 numbers using do while loop
/*public class Pract {
    public static void main(String args[]){
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}
*/

//print 1-10 numbers using for loop
/*public class Pract {
    public static void main(String[] args) {
        int i;
        
        for(i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
*/

//print 1-50 even numbers 
/*public class Pract {
    public static void main(String[] args) {
        int i;

        for(i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
*/

//print 1-50 Odd numbers 
/*public class Pract {
    public static void main(String[] args) {
        int i;

        for(i=1;i<=50;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
    */

//print 1-50 numbers divisible by 5,7 
/*public class Pract {
    public static void main(String[] args) {
        int i;

        for(i=1;i<=50;i++){
            if(i%5==0 && i%7==0){
                System.out.println(i);
            }
        }
    }
}
    */

//accept no and print multiplication table
/*public class Pract {
    public static void main(String[] args) {
        int i,j,ans;
        i=Integer.parseInt(args[0]);
        for(j=1;j<=10;j++){
            ans=i*j;
            System.out.println(ans);
        }
    }
}
*/

//Print 1-10 multiplication table
/*public class Pract {
    public static void main(String[] args) {
        int i,j,a=1;

        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                a=i*j;
                System.out.println(a);
            }
            System.out.println(" ");
            
        }
    }
}
*/

// print 10-1 numbers
/*public class Pract {
    public static void main(String[] args) {
        int i=10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}
    */

// check and print if given no is prime no.
/*public class Pract {
    public static void main(String[] args) {
        int no,i,flag=0;
        no=Integer.parseInt(args[0]);

        for(i=2;i<no;i++){
            if(no%i==0){
                flag=1;
                break;
            }}
            if(flag==0){
                System.out.println("Prime number.");
            }
            else
                System.out.println("Not a prime number.");
    }
}
    */

//accept no and print in reverse
/*public class Pract {
    public static void main(String[] args) {
        int no,rem;
        no=Integer.parseInt(args[0]);
        while(no>0){
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }
}
    */

//accept 2nos and print nos in between.
/*public class Pract {
    public static void main(String[] args) {
        int a,b,i;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        for(i=a;i<=b;i++){
            System.out.println(i);
        }
    }
} 
*/
//accept 2nos and print sum of nos in between.
/*public class Pract {
    public static void main(String[] args) {
        int a,b,i,sum=0;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        for(i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
    */

//sum of 1-10 nos
/*public class Pract {
    public static void main(String[] args) {
        int i,sum=0;
        for(i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
    */

// accept no and cal factorial
/*public class Pract {
    public static void main(String[] args) {
        int no,fact=1,i;
        no=Integer.parseInt(args[0]);
        for(i=1;i<=no;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
    */

//accept a number and check if its prime or not.
/*public class Pract {
    public static void main (String args[]){
        int no,i,flag=0;
        no=Integer.parseInt(args[0]);
        
            for(i=2;i<no;i++){
                if(no%i==0){
                    flag=1;
                    break;
                }}
                if(flag==0){
                    System.out.println("Prime Number");
                }
                
                else
                System.out.println("Not a Prime Number");

    }
}
*/

/*public class Pract {
    public static void main(String[] args) {
        int no,i,flag=0;
        no=Integer.parseInt(args[0]);

        for(i=2;i<no;i++){
            if(no%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime Number");
        }
        else
        System.out.println("not a prime Number");
    }
}
*/

// accept a number and print digits in reverse
/*public class Pract {
    public static void main(String[] args) {
        int no,rem=0;
        no=Integer.parseInt(args[0]);

        while (no>0) {
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }
}
*/

//accept a number and find its factorial
/*public class Pract{
    public static void main(String[] args) {
        int no,i,fact=1;
        no=Integer.parseInt(args[0]);
        for(i=1;i<=no;i++){
            fact=fact*i;
        }
        System.out.println("factorial is : "+fact);
    }
}
*/

//accept 2nos and calculate sum of numbers in between.
/*public class Pract {
    public static void main(String[] args) {
        int a,b,i,sum=0;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        for(i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
 */

//print 10-1 numbers
/*public class Pract {
    public static void main(String[] args) {
        int i;
        for(i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}
*/

//accept no and print its multiplication table
/*public class Pract {
    public static void main(String[] args) {
        int no,i,a=1;
        no=Integer.parseInt(args[0]);
        for(i=1;i<=10;i++){
            a=no*i;
            System.out.println(a);
        }
    }
}
*/
//1-10 multi table
/*public class Pract {
    public static void main(String[] args) {
        int i,j,a=1;

        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                a=i*j;
                System.out.println(a);
            }
            System.out.println(" ");
        }
    }
}
*/

//do while
/*public class Pract {
    public static void main(String[] args) {
        int i=1;

        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}
*/

//accept month and print how many days it has
/*public class Pract {
    public static void main(String[] args) {
        String mnt=args[0];

        switch (mnt) {
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
            System.out.println("31 Days.");    
                break;
            
            case "feb":
            System.out.println("28 Days.");
            break;
            
            case "apr":
            case "jun":
            case "sep":
            case "nov":
            System.out.println("30 Days");
            break;

            default:
            System.out.println("Please enter a valid choice.");
        
        }
    }
}
*/

//accept 2 nos and perform addition,substraction,multiplication,division based on choice.
/*public class Pract {
    public static void main(String[] args) {
        int a,b,c,choice;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        choice=Integer.parseInt(args[2]);

        switch (choice) {
            case 1:
            c=a+b;
            System.out.println(c);
            break;
            
            case 2:
            c=a-b;
            System.out.println(c);
            break;

            case 3:
            c=a*b;
            System.out.println(c);
            break;

            case 4:
            c=a/b;
            System.out.println(c);
            break;

            default:
            System.out.println("Please enter a valid choice.");
                break;
        }
    }
}
*/

//Accept 3 sides of triangle and check if its equi, iso or scalar.
/*public class Pract {
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);

        if(a==b && b==c && c==a){
            System.out.println("Equilateral Triangle.");
        }
        else if(a==b || b==c  || c==a){
            System.out.println("Isosceles Triangle.");
        }
        else{
            System.out.println("Scalar Triangle.");
        } 

    }
}
*/

/*public class Pract {
    public static void main(String[] args) {
        int no,rem=0;
        no=Integer.parseInt(args[0]);

        while(no>0){
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }
}
*/

/*public class Pract {
    public static void main(String[] args) {
        int no,i,flag=0;
        no=Integer.parseInt(args[0]);

        for(i=2;i<no;i++){
            if(no%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime Number.");
        }
        else
        System.out.println("Not a Prime Number.");
    }
} 
*/

/*public class Pract {
    public static void main(String[] args) {
        int a,b,i;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);

        for(i=a;i<=b;i++)
        {
            System.out.println(i);
        }
    }
}
*/

/*public class Pract {
    public static void main(String[] args) {
        int a,b,i,sum=0;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);

        for(i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
*/

/*public class Pract {
    public static void main(String[] args) {
        int no,rem=0,sum=0;
        no=Integer.parseInt(args[0]);

        while(no>0){
            rem=no%10;
            sum=sum+rem; 
            no=no/10;
        }
        System.out.print(sum);
    }
}
*/

/* Pract
//for each loop
public class Pract {
    public static void main(String[] args) {
        String nm[] ={"Chaitanya","Asha","Sandeep","Patil"};
        for(String s:nm)
        {
            System.out.println(s);
        }
    }
}
    */

/**
 
 
public class Pract {
    public static void main(String args[])
    {
        String nm[] ={"Chaitanya","Patil"};
        for(String s:nm)
        {
            System.out.println(s);
        }
    }
}
*/

//array

/* Pract

public class Pract {
    public static void main(String[] args) {
        int no[]=new int[3];
       
        no[0]=1;
        no[1]=2;
        no[2]=3;
        for(int i=0;i<3;i++)
        {
            System.out.println(no[i]);
        }
    }
}


/* Pract
 import java.util.*;
 public class Pract {
    public static void main(String[] args) {
        int no[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter no: ");
            no[i]= sc.nextInt();
        }
        for(i=0;i<5;i++){
        System.out.println(no[i]);
        }
    }
 }
*/

/* Pract
import java.util.*;
 
public class Pract {
    public static void main(String[] args) {
        int nm[]= new int[5];
        int i;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.println("Enter a number :");
            nm[i]= sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println(nm[i]);
        }
    }
}

*/

/* Pract
import java.util.*;

public class Pract {
    public static void main(String[] args) {
        int nm[]= new int[5];
        int i;
        Scanner sc= new Scanner(System.in);


        for(i=1;i<5;i++){
            System.out.println("Enter no: ");
            nm[i]=sc.nextInt();
        }
        for(i=1;i<5;i++){
            System.out.println(nm[i]);
        }

    }
}
*/

/* Pract
import java.util.*;

public class Pract {
    public static void main(String[] args) {
        int i;
        int nm[]= new int[5];
        Scanner sc=new Scanner(System.in);

        for(i=0;i<5;i++)
        {
            System.out.println("Enter Number: ");
            nm[i]= sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println(nm[i]);
        }
    }
}
*/

/* Pract
//sort 5 numbers in ascending order using array
import java.util.*;


public class Pract {
    public static void main(String[] args) {
        int i,j,temp=0;
        int nm[]=new int[5];
        Scanner sc=new Scanner(System.in);

        for(i=0;i<5;i++){
            System.out.println("Enter no:");
            nm[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++){
                if(nm[i]>nm[j]){
                    temp=nm[i];
                    nm[i]=nm[j];
                    nm[j]=temp;
            }

        }
        System.out.println(nm[i]);
        }
    }
}
*/

/* Pract
import java.util.*;


public class Pract {
    public static void main(String[] args) {
        int i,j,temp=0;
        int nm[]=new int[5];
        Scanner sc=new Scanner(System.in);

        for(i=0;i<5;i++)
        {
            System.out.println("Enter number :");
            nm[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++){
                if(nm[i]>nm[j]){
                    temp=nm[i];
                    nm[i]=nm[j];
                    nm[j]=temp;
                }
            }
            System.out.println(nm[i]);
        }
    }
}
 */

// input 10 nos and count pos,neg,zeros

/* Pract
import java.util.*;


public class Pract {
   public static void main(String[] args) {
       int i,j,pos=0,neg=0,zer=0;
       int nm[]= new int[10];
       Scanner sc=new Scanner(System.in);
       
       for(i=0;i<10;i++){
           System.out.println("Enter number :");
           nm[i]=sc.nextInt();
       }
       for(i=0;i<10;i++){
           if(nm[i]>0){
               pos++;
           }
           else if(nm[i]<0){
               neg++;
           }
           else {
               zer++;
           }
       }
       
       System.out.println("Count of Pos nos:"+pos);
       System.out.println("Count of neg nos:"+neg);
       System.out.println("Count of zer nos:"+zer);
   }
}
*/

/*
Pract

public class Pract {
    public static void main(String args[]){
        String nm[]={"chaitanya","patil"};
        for(String s:nm){
            System.out.println(s);
        }
    }
}
     */
/* Pract
import java.util.*;

 
public class Pract {
    public static void main(String args[]){
        int nm[][]=new int[2][3];
        int i,j;
        nm[0][0]=10;
        nm[0][1]=20;
        nm[0][2]=30;
        nm[1][0]=40;
        nm[1][1]=50;
        nm[1][2]=60;

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print("|"+nm[i][j]);
            }
            System.out.println();
        }
    }
}
    */
/*Pract
import java.util.*;

 Pract get numbers in 2d array
 
public class Pract {
    public static void main(String[] args) {
        int nm[][]=new int[2][3];
        int i,j;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.println("Enter no:");
                nm[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(nm[i][j]);
            }
            System.out.println();
        }
    }
}
*/

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Pract
import java.util.*;


public class Pract {
    public static void main(String[] args) {
        int i,j;
        int no[][]=new int[2][3];
        Scanner sc =new Scanner(System.in);

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.println("Enter a number :");
                no[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(no[i][j]);
            }
            System.out.println();
        }
    }
}   
*/

/*Pract
import java.util.*;


public class Pract {
    public static void main(String[] args) {
        int no[][]=new int[3][5];
        Scanner sc=new Scanner(System.in);
        int i,j;

        for(i=0;i<3;i++){
            System.out.println("Enter roll no :");
            no[i][0]=sc.nextInt();

                System.out.println("Enter 3 sub marks :");
                no[i][0]=sc.nextInt();
                no[i][1]=sc.nextInt();
                no[i][2]=sc.nextInt();
                no[i][3]=sc.nextInt();
                no[i][4]= no[i][1]+no[i][j]+no[i][2]+no[i][3];
        }
            for(i=0;i<3;i++){
                for(j=0;j<5;j++){
                    System.out.prin(no[i][j]+"+");
                }
                System.out.println();
            }
    }
}
*/
/* 
//jagged array
class Pract {
    public static void main(String args[]){
        int [][] jaggedArray = {
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };
        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]+"");
            }
            System.out.println();
        }
    }
}
*/
/* 
class Pract{
    public static void main(String args[]){
        int [][] jaggedArray={
            {1,2},
            {3,4,5},
            {6,7,8,9}
        };
        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.err.print(jaggedArray[i][j]);
            }
            System.out.println();
        }
    }
*/

//accept 3 subs and print addition using 2D array
/* 
import java.util.*;
class Pract{
    public static void main(String args[]){
        int no[][]= new int[3][5];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println("Enter roll no:");
            no[i][0] = sc.nextInt();
            System.err.println("enter 3 sub marks");
            no[i][1]=sc.nextInt();
            no[i][2]=sc.nextInt();
            no[i][3]=sc.nextInt();
            no[i][4]=no[i][1]+no[i][2]+no[i][3];
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(no[i][j]+"|");
            }
            System.out.println();
        }
    }
}
*/

/* 
import java.util.*;
class Pract{
    public static void main(String args[]){
        int no[][]=new int[3][5];
        int i,j;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<3;i++){
            System.out.println("Enter roll no :");
            no[i][0]=sc.nextInt();
            System.err.println("Enter 3 Subject marks :");
            no[i][1]=sc.nextInt();
            no[i][2]=sc.nextInt();
            no[i][3]=sc.nextInt();
            no[i][4]=no[i][1]+no[i][2]+no[i][3];
        }
        for(i=0;i<3;i++){
            for(j=0;j<5;j++){
                System.out.print(no[i][j]+"|");
            }
            System.err.println();
        }
    }
}
*/

//get 6 inputs using 2d array and print
/* 
import java.util.*;
class Pract{
    public static void main(String args[]){
        int no[][]=new int[2][3];
        int i,j;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.println("Enter no:");
                no[i][j]=sc.nextInt();
            }
            
        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(no[i][j]);
            }
            System.out.println();
        }
    }
}
*/
/* 
import java.util.*;
class Pract{
    public static void main(String args[]){
        int no[][]=new int[2][3];
        int i,j;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.err.println("Enter no: ");
                no[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.err.print(no[i][j]);
            }
            System.out.println();
        }
    }
}
*/

/* 
//2d array
class Pract{
    public static void main(String args[]){
        int no[][]=new int[2][3];
        int i,j;
        no[0][0]=10;
        no[0][1]=20;
        no[0][2]=30;
        no[1][0]=40;
        no[1][1]=50;
        no[1][2]=60;
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(no[i][j]);
            }
            System.out.println();

        }
    }
}
*/
/* 
//for each
class Pract{
    public static void main(String[] args) {
        String nm[]={"Chaitanya","Patil"};
        for(String s:nm){
            System.out.println(s);
        }
    }
}
*/
//accept and print 5 numbers using array
/* 
import java.util.*;
class Pract{
    public static void main(String[] args) {
        int i;
        int no[]=new int[5];
        Scanner sc=new Scanner(System.in);

        for(i=0;i<5;i++){
            System.out.println("Enter no:");
            no[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println(no[i]);
        }
    }
}
*/

//accept 5 numbers and sort ascending
/* 
import java.util.*;
class Pract{
    public static void main(String args[]){
        int i,j,temp=0;
        int n[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.println("Enter no:");
            n[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++)
            if(n[i]>n[j]){
                temp=n[i];
                n[i]=n[j];
                n[j]=temp;
            }
            System.out.println(n[i]);
        }
    }
}
*/
//accept 10nos and count pos neg zeros
/* 
import java.util.*;
class Pract{
    public static void main(String args[]){
        int i,pos=0,neg=0,zer=0;
        int n[]=new int[10];
        Scanner sc=new Scanner(System.in);

        for(i=0;i<10;i++){
            System.out.println("Enter nos :");
            n[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            if(n[i]>0){
                pos++;
            }
            else if(n[i]<0){
                neg++;
            }
            else{
                zer++;
            }
        }
        System.out.println("Count of pos: "+pos);
        System.out.println("Count of neg: "+neg);
        System.out.println("Count of zer: "+zer);
    }
}
*/

//Diamond pattern

/* 
public class Pract {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>=0;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/* 
public class Pract {
    public static void main(String[] args) {
        int i,j,n=5;

        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>0;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/
/* 
class Pract{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/* 
class Pract{
    public static void main(String args[]){
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/* 
class Pract{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
*/
/*
class Pract{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<5;i++){
            for(j=n-i;j>=1;j--){
                System.err.print(" ");
            }
            for(j=1;j<=i;j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
*/
/* 
class Pract{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.err.print("*");
            }
            System.out.println();

        }
    }
}
*/
/* 
class Pract{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=n;i>=1;i--){
            for(j=1;j<=n;j++){
                System.err.print(" ");
            }
            for(j=n-i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/* 
class Pract{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=n;i>=1;i--){
            for(j=1;j<=n;j++){
                System.out.print(" ");
            }
            for(j=n-i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/* 
class Pract{
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++){
            for(j=n-i;j>=1;j--){
                System.out.print("*");
            }
            for(j=1;j<=i;j++){
                System.err.print(" ");
            }
            System.out.println();

        }
    }
}
*/

/* 
//sum of digits of a number
class Pract{
    public static void main(String[] args) {
        int no,rem=0,sum=0;
        no=Integer.parseInt(args[0]);
        while(no>0){
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        System.out.println(sum);
    }
}
*/

//palindrome
/*
class Pract{
    public static void main(String[] args) {
        int no,rem,sum=0,no1;
        no=Integer.parseInt(args[0]);
        no1=no;
        while(no1>0){
            rem=no1%10;
            sum=sum*10+rem;
            no1=no1/10;
        }
        if(sum==no){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}
 */
/* 
class Pract{
    public static void main(String[] args) {
        int no,sum=0,rem,no1;
        no=Integer.parseInt(args[0]);
        no1=no;
        while(no1>0){
            rem=no1%10;
            sum=sum*10+rem;
            no1=no1/10;
        }
        if(sum==no){
            System.err.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
*/
/*
//armstrong
class Pract{
    public static void main(String[] args) {
        int no,sum=0,rem,no1;
        no=Integer.parseInt(args[0]);
        no1=no;
        while(no1>0){
            rem=no1%10;
            sum=sum+rem*rem*rem;
            no1=no1/10;
        }
        if(sum==no){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}
*/
/* 
//prime
class Pract{
    public static void main(String[] args) {
        int no,i,flag=0;
        no=Integer.parseInt(args[0]);
        for(i=2;i<no;i++){
            if(no%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("prime");
        }
        else{
            System.err.println("not prime");
        }
    }
}
*/

//fibonacci
/* 
class Pract{
    public static void main(String[] args) {
        int a,b,c,no;
        a=0;
        b=1;
        no=Integer.parseInt(args[0]);
        System.out.println(a);
        System.out.println(b);
        while(no>0){
            c=a+b;
            a=b;
            b=c;
            no--;
            System.out.println(c);
        }
    }
}
*/
/* 
//fact
class Pract{
    public static void main(String[] args) {
    int no,f=1,i;
    no=Integer.parseInt(args[0]);
    for(i=1;i<=no;i++){
    f=f*i;
    }
    System.out.println(f);  
    }
}
*/
/* 
//print reverse
class Pract{
    public static void main(String[] args) {
        int no,rem=0;
        no=Integer.parseInt(args[0]);
        while(no>0){
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }
}
*/
/*
class Pract{
    public static void main(String[] args) {
        int i,j,n;
        n=5;
        for(i=0;i<n;i++){
            for(j=2*n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/* 
class Pract{
    public static void main(String[] args) {
        int i,j,n;
        n=5;
        for(i=0;i<n;i++){
            for(j=n-i;j>=0;j--){
                System.out.print("*");
            }
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

*/
/* 
class Pract{
    public static void main(String[] args) {
        int [][]jaggedArray={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]);
            }
            System.out.println();
        }
    }
}
*/
/* 
class Pract{
    public static void main(String[] args) {
        int jaggedArray[][]={
            {1,2},
            {3,4,5}
        };
        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]);
            }
            System.out.println();
        }
    }
}
*/

/* 
class Pract{
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
              System.out.print(i + "," + j + " ");
            }
        }
    }
}

*/

// average and sum of diiferent ages using array
/*
class Pract{
    public static void main(String args[])
    {
        int ages[]={20,30,50,55,60,22,26};
        float avg,sum=0;
        int length=ages.length;
        
        for(int age: ages)
        {
            sum=sum+age;
        }
        avg=sum/length;
        System.out.println("the avg age is: "+avg+"\t sum of all ages:"+sum);
    }
}

*/

// lowest age of different ages

/* 
class Pract
{
    public static void main(String args[])
    {
        int ages[]={10,20,30,40,50,60,26,28,9};

        int lowage=ages[0];

        for(int age: ages)
        {
            if(lowage>age)
            {
                lowage=age;
            }
        }
        System.out.println("Lowest age is: "+lowage);
    }
}

*/
/* 
// Q write a program to add three numbers.
class Pract
{
    public static void  main(String args[])
    {
        int num1=5;
        int num2=9;
        int num3=7;
        int sum=num1+num2+num3;
        System.out.println("addition is :"+sum);
    }
}

*/
//Scanner sc=new Scanner(System.in);
// for one word
// String s=sc.next();
// to scan whole line
// String s=sc.nextLine();
/* 
import java.util.*;
class Pract
{
    public static void main(String[] args) {
      
    System.out.println("Enter a name : ");
    Scanner s=new Scanner(System.in);
    String name=s.nextLine();
    System.out.println("hello "+name+" Good morning.");

    System.out.println("Enter Kilometers:");
    Scanner s=new Scanner(System.in);
    Double kil=s.nextDouble();
    Double mile=kil*0.621371;
    System.out.println("Miles : "+mile);


System.out.println("Enter Number :");
Scanner s=new Scanner(System.in);
System.out.println(s.hasNextInt());
 

    double s1,s2,s3,s4,s5,avg,per;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Marks of 5 subjects each out of 100: ");
    s1=s.nextDouble();
    s2=s.nextDouble();
    s3=s.nextDouble();
    s4=s.nextDouble();
    s5=s.nextDouble();
    
    avg=(s1+s2+s3+s4+s5)/5;
    System.out.println("Percenatage :"+avg+"%");
    String name= "chaitanya";    
    string lstr= name.toLowerCase();
    }
}

*/

// anagram
/* 
import java.util.*;

public class Pract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter two Strings : ");
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        String copys1=s1.replaceAll("s", "");
        String copys2=s2.replaceAll("s", "");

        boolean status=true;
        if(copys1.length() !=copys2.length())
        {
            status=false;
        }
        else
        {
        char [] s1Array =copys1.toLowerCase().toCharArray();
        char [] s2Array =copys2.toLowerCase().toCharArray();
        
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        status= Arrays.equals(s1Array,s2Array);
        }
        if(status==true)
        {
            System.out.println(s1+" And "+s2+" Are anagrams.");
        }
        else
        {
            System.out.println(s1+" And "+s2+" Are Not anagrams.");
        }
        
    }
}

*/

/* 
//ANagram

import java.util.*;
class Pract {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("ENter two Strings");
        String s1 =c.nextLine();
        String s2 =c.nextLine();

        String copys1=s1.replaceAll("s", "");
        String copys2=s2.replaceAll("s", "");

        boolean status=true;
        if(copys1.length() !=copys2.length())
        {
            status=false;
        }
        else
        {
            char [] s1array=copys1.toLowerCase().toCharArray();
            char [] s2array=copys2.toLowerCase().toCharArray();

            Arrays.sort(s1array);
            Arrays.sort(s2array);
            status=Arrays.equals(s1array,s2array);
        }
        if(status==true)
        {
            System.out.println(s1+" and "+s2+" Are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" Are anagrams");
        }
    }
}

*/

/* 
//anagram

import java.util.*;

class Pract
{
    public static void main(String[] args) {
        
        Scanner c=new Scanner(System.in);
        System.out.println("Enter two Stings:");
        String s1=c.nextLine();
        String s2=c.nextLine();

        String copys1=s1.replaceAll("s","");
        String copys2=s2.replaceAll("s", "");

        boolean status=true;
        if(copys1.length()!=copys2.length())
        {
            status=false;
        }
        else
        {
            char [] s1array=copys1.toLowerCase().toCharArray();
            char [] s2array=copys2.toLowerCase().toCharArray();

            Arrays.sort(s1array);
            Arrays.sort(s2array);
            status =Arrays.equals(s1array,s2array);
        }
        if(status==true)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}

*/

/* 
import java.util.*;

public class Pract {
    public static void main(String[] args) {
        int no [][]=new int[3][5];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            System.out.println("Enter Roll no");
            no [i][0]=sc.nextInt();
            System.out.println("Enter 3 Sub Marks : ");
            no [i][1]=sc.nextInt();
            no [i][2]=sc.nextInt();
            no [i][3]=sc.nextInt();
            no [i][4]=no[i][1]+no[i][2]+no[i][3];

        }
        for(i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(no[i][j]+"\t");
            }
            System.out.println();
        }


    }
}

*/

//accept 5 number and sort them in acsending order using array

/* 
import java.util.*;
public class Pract {
    public static void main(String[] args) {
        int i,j,temp;
        int no []= new int[5];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a num :");
            no[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(no[i]>no[j])
                {
                    temp=no[i];
                    no[i]=no[j];
                    no[j]=temp;
                }
            }
            System.out.println(no[i]);
        }
    }
}

*/
/* 
public class Pract {
    public static void main(String[] args) {
        int a=0,b=1,c,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no :");
        no=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(no>0)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            no--;
        }
    }
}

*/

// 

// import java.util.*;

// class Bank{
//     int accno;
//     String accnm;
//     double balance;

//     void getaccinfo(int no, String nm, double bal)
//     {
//         accno=no;
//         accnm=nm;
//         balance=bal;
//     }
//     void display()
//     {
//         System.out.println("ACCOUNT NO : "+accno);
//         System.out.println("ACCOUNT HOLDER's NAME : "+accnm);
//         System.out.println("BALANCE : "+balance);
//     }
// }

// class Withdraw extends Bank
// {
//     void withdraw(int wit)
//     {
//         balance -=wit;
//     }
// }

// class Deposite extends Bank
// {
//     void deposite(int dep)
//     {
//         if(balance>1000)
//         {
//             balance +=dep;
//         }
//         else
//         {
//             System.out.println("Insufficient Balance");
//         }
//     }
// }

// class Pract
// {
//     public static void main(String[] args) {
//         Withdraw w=new Withdraw();
//         Deposite d=new Deposite();

//         Scanner sc=new Scanner(System.in);
//         int choice;
//         System.out.println("PRESS 1: TO WITHDRAW /n PRESS 2: TO DEPOSITE");
//         System.out.println("ENTER YOUR CHOICE :");
//         choice=sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("ENTER ACCOUNT NO :");
//                 int no=sc.nextInt();

//                 System.out.println("ENTER ACCOUNT HOLDER's NAME :");
//                 String nm=sc.next();

//                 System.out.println("ENTER BALANCE :");
//                 double bal=sc.nextInt();

//                 System.out.println("ENTER AMOUNT TO WITHDRAW");
//                 int wit=sc.nextInt();

//                 w.getaccinfo(no,nm,bal);
//                 w.withdraw(wit);
//                 w.display();
//                 break;

//             case 2:
//                 System.out.println("ENTER ACCOUNT NO :");
//                 no=sc.nextInt();

//                 System.out.println("ENTER ACCOUNT HOLDER's NAME :");
//                 nm=sc.next();

//                 System.out.println("ENTER BALANCE :");
//                 bal=sc.nextInt();

//                 System.out.println("ENTER AMOUNT TO DEPOSITE");
//                 int dep=sc.nextInt();

//                 w.getaccinfo(no,nm,bal);
//                 w.withdraw(dep);
//                 w.display();

//             default:

//                 System.out.println("ENTER VALID CHOICE!");
//                 break;
//         }
//     }
// }

// import java.util.*;

// class Bank {
//     int acno;
//     String acnm;
//     double balance;

//     void getaccinfo(int no, String nm, double bal) {
//         acno = no;
//         acnm = nm;
//         balance = bal;
//     }

//     void display() {
//         System.out.println("ACCOUNT NO : " + acno);
//         System.out.println("ACCOUNT HOLDER's NAME : " + acnm);
//         System.out.println("BALANCE : " + balance);
//     }
// }

// class Deposite extends Bank {
//     void deposite(int dep) {
//         balance += dep;
//     }
// }

// class Withdraw extends Bank {
//     void withdraw(int wit) {
//         balance -= wit;
//     }
// }

// class Pract {
//     public static void main(String[] args) {
//         Deposite d = new Deposite();
//         Withdraw w = new Withdraw();

//         Scanner sc = new Scanner(System.in);

//         System.out.println("PRESS 1: TO DEPOSITE /n PRESS 2: TO WITHDRAW");
//         System.out.println("ENTER YOUR CHOICE :");
//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("ENTER ACCOUNT NO :");
//                 int no = sc.nextInt();

//                 System.out.println("ENTER ACCOUNT HOLDER's NAME :");
//                 String nm = sc.next();

//                 System.out.println("ENTER BALANCE :");
//                 double bal = sc.nextDouble();

//                 System.out.println("ENTER AMOUNT TO DEPOSITE : ");
//                 int dep = sc.nextInt();

//                 d.getaccinfo(no, nm, bal);
//                 d.deposite(dep);
//                 d.display();

//                 break;
//             case 2:
//                 System.out.println("ENTER ACCOUNT NO :");
//                 no = sc.nextInt();

//                 System.out.println("ENTER ACCOUNT HOLDER's NAME :");
//                 nm = sc.next();

//                 System.out.println("ENTER BALANCE :");
//                 bal = sc.nextDouble();

//                 System.out.println("ENTER AMOUNT TO WITHDRAW : ");
//                 int wit = sc.nextInt();

//                 w.getaccinfo(no, nm, bal);
//                 w.withdraw(wit);
//                 w.display();

//                 break;
//             default:
//                 System.out.println("ENTER A VALID CHOICE!!!");
//                 break;
//         }

//     }
// }
// import java.util.*;
// class Anagram
// {

//     static void isAnagram(String s1, String s2)
//     {
//         String copys1 = s1.replaceAll("s", "");
//         String copys2 = s2.replaceAll("s", "");

//         boolean status = true;

//         if (copys1.length()!=copys2.length())
//         {
//             status=false;
//         }
//         else
//         {
//             char [] s1array=copys1.toLowerCase().toCharArray();
//             char [] s2array=copys2.toLowerCase().toCharArray();

//             Arrays.sort(s1array);
//             Arrays.sort(s2array);

//             status=Arrays.equals(s1array,s2array);
//         }
//         if(status)
//         {
//             System.out.println(s1+" AND " +s2+" are anagrams");
//         }
//         else{
//             System.out.println(s1+" and "+s2+" are not");
//         }
//     }
//     public static void main(String[] args) {

//         isAnagram("KEEP","peeK");
       
//     }
// }

// import java.util.*;
// class bank
// {
//     int acno,balance;
//     String acnm;
//     void getinfo(int no,int bal, String nm)
//     {
//         acno=no;
//         balance=bal;
//         acnm=nm;

//     }
//     void display()
//     {
        
//         System.out.println("Account no : "+ acno);
//         System.out.println("Account name : "+ acnm);
//         System.out.println("Account balance : "+ balance);
//     }
// }
// class Withdraw extends bank
// {
//     void withdraw(int wit)
//     {
//         if(balance>1000)
//         {
//             balance -=wit;
//         }
//         else
//         {
//             System.out.println("Insufficien  balance!!!");;
//         }
//     }
// }

// class Deposite extends bank
// {
//     void deposite(int dep)
//     {
//         balance +=dep;
//     }
// }

// class Pract
// {
//     public static void main(String[] args) {
//         Withdraw w=new Withdraw();
//         Deposite d=new Deposite();

//         System.out.println("Press 1 for deposite /n press 2 for withdrawal");
//         Scanner sc=new Scanner(System.in);
//         int choice=sc.nextInt();

//         switch(choice){
//             case 1:
//             System.out.println("enter Account no");
//             int no=sc.nextInt();
//             System.out.println("enter Name");
//             String nm=sc.next();
//             System.out.println("enter balance");
//             int bal=sc.nextInt();
//             System.out.println("enter amount to deposite");
//             int dep=sc.nextInt();
//             d.getinfo(no, bal, nm);
//             d.deposite(dep);
//             d.display();
            
//             break;

//             case 2:
//             System.out.println("enter Account no");
//             no=sc.nextInt();
//             System.out.println("enter Name");
//             nm=sc.next();
//             System.out.println("enter balance");
//             bal=sc.nextInt();
//             System.out.println("enter amount to withdraw");
//             int wit=sc.nextInt();
//             w.getinfo(no, bal, nm);
//             w.withdraw(wit);
//             w.display();
            
//             break;

//             default:
//             System.out.println("enter correct choice");
//             break;
//         }
//     }
// }

// class A2{  
//     static{System.out.println("static block is invoked");}  
//     public static void main(String args[]){  
//      System.out.println("Hello main");  
//     }  
//   }  
  

// abstract class Test  
// {  
//     static int i = 102;  
//     static void TestMethod()  
//     {  
//         System.out.println("hi !! I am good !!");  
//     }  
// }  
// public class Pract extends Test   
// {  
//     public static void main (String args[])  
//     {  
//         Test.TestMethod();  
//         System.out.println("i = "+Test.i);  
//     }  
// }  

// abstract class Test{
//     static int i=101;
//     static void TestMethod(){
//         System.out.println("Hi ! I am good.");
//     }
// }
// public class Pract{
//     public static void main(String[] args) {
        
//         Test.TestMethod();
//         System.out.println("i="+Test.i);
//     }
// }















import java.util.*;
import java.io.*;

public class Pract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int sum=A.length()+B.length();
        System.out.println(sum);

        int n=A.compareTo(B);
        if(n>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        String output=A.substring(0, 1).toUpperCase()+A.substring(1);
        String output1=B.substring(0, 1).toUpperCase()+B.substring(1);

        System.out.println(output+" "+output1);
    }
}









