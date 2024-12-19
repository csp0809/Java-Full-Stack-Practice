// public class Pr {
//     public static void main(String[] args) {
//         int [] str={3,3,4,4,5,6,7};
//         int i,j,temp=0;

//         for(i=0;i<str.length;i++){
//             for(j=i+1;j<str.length;j++){
//                 if(str[i] !=str[j]){
                    
                    
//                 }
//                 System.out.print(str[j]);

//             }
            
//         }
        
        
//     }
// }


// import java.util.*;
// public class Pr {
//     int x;
//     Pr(int a){
//         x=a;
//     }
//     void rev(){
//         int rev,i;
//         while(x>0){
//             rev=x%10;
//             System.out.print(rev);
//             x=x/10;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter a number");
//         int x=sc.nextInt();
//     Pr p=new Pr(x);
//         p.rev();
//     }
// }


//throw keyword
//custom exception

// class Pr extends Exception{
//     Pr(String s){
//         super(s);
//     }

// }
// class AgeTracker{
//     public static void ageCheck (int age)throws Pr{
//         if(age>18){
//             System.out.println("Youre eligible to vote");
//         }
//         else{
//             throw new Pr("Youre not old enough to vote");
//         }
//     }
//     public static void main(String[] args) {
//         try {
//             ageCheck(12);
//         } catch (Exception e) {
//             System.out.println(e);
//         }

//     }
// }


//throw keyword
//custom exception

// class Pr extends Exception{
//     Pr(String s){
//         super(s);
//     }
// }
// class AgeTracker 
// {
//     public static void ageCheck(int age)throws Pr{
//         if(age>18){
//             System.out.println("vote");
//         }
//         else{
//             throw new Pr("Not old enough");
//         }
//     }
//     public static void main(String[] args) {
//         try {
//             ageCheck(11);
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }


// //Static variable and method
// public class Pr {

//     static int a=10;
//     static int b=10;

//     static void add(){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         add();
//     }

// }

//Enum

// public class Pr {

//     enum Seeason{
//         Summer,Winter,Rainy
//     }
//     public static void main(String[] args) {
//         for(Seeason s:Seeason.values())
//         System.out.println(s);
//     }
// }


public class Pr {

    enum Season{
        Summer,Winter,Rainy
    }
    public static void main(String[] args) {
        for(Season s:Season.values())
        System.out.println(s);
    }
}