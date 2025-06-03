/*

*  
*  *
*  *  *
*  *  *  *
*  *  *  *  * print this patern

public class pat {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    
}
*/

/*



*  *  *  *  *  
*  *  *  *
*  *  *
*  *
* Prints this pattern

public class pat {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    
}
*/


/* 
        *
      * *
    * * *
  * * * *
* * * * *
public class pat {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++){
            for(k=5-i;k>=1;k--)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
*/

/* 
*****
 ****
  ***
   **
    *


public class pat {
    public static void main(String[] args) {
        int i,j,k,no;
        no=Integer.parseInt(args[0]);
        for(i=no;i>=1;i--)
        {
            for(j=no;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/

/* 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

/* 
public class pat {
    public static void main(String[] args) {
        int i,j,k=1,no;
        no=Integer.parseInt(args[0]);
        k=no-1;
        for(j=1;j<=no;j++){
            for(i=1;i<=k;i++){
                System.out.print(" ");
            }
            k--;
            for(i=1;i<=2*j-1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        k=1;
        for(j=1;j<=no;j++){
            for(i=1;i<=k;i++){
                System.out.print(" ");
            }
            k++;
            for(i=1;i<=2*(no-j)-1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/
/**
 * pat
 */

/*
public class pat {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<=4;i++){
            for(j=0;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");

        for(i=0;i<=4;i++){
            for(j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");


        for(i=0;i<=4;i++){
            for(j=0;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<=4;i++){
            for(j=4;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}   

 */

/**
 * pat
 */
/* 
public class pat {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<5;i++){
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(i=0;i<5;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(k=3;k>=i;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
*/
/* 
public class pat {

	public static void main(String[] args) {
		int n = 5;
				
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i* 2 - 1 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n - 1; i > 0; i--) {
			for (int j = 1; j <= n - i; j++)//printing whitespaces
			{
				System.out.print(" ");
			}
            
			for (int j = 1; j <= i* 2 - 1 ; j++)//printing stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
*/

/* 
public class pat {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

/* 

public class pat {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

*/
/* 
public class pat {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

*/

// public class pat {
//     public static void main(String[] args) {
//         int i,j;
//         for(i=1;i<=5;i++){
            
//             for(j=5;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }

public class pat {

    public static void main(String args []){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}