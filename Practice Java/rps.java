import java.util.Scanner;
import java.util.Random;

class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User is giving the input.
        System.out.println("Lets Start the game : ");
        System.out.println("Rock : 0");
        System.out.println("Paper : 1");
        System.out.println("Scissor : 2");
        System.out.print("Choose the options : ");
        Random rand = new Random();
        int i = 1;
        int Your_Turn,Computer_Turn;
        Your_Turn = sc.nextInt(3);
        //Computer is giving the input.
        Computer_Turn = rand.nextInt(3);
    
    System.out.println("You choosed : ");
    switch(Your_Turn) {
        case 0:
        System.out.println("Rock");
        break;
        case 1:
        System.out.println("Paper");
        break;
        case 2:
        System.out.println("Scissor");
        break;
    }
    System.out.println("Computer choosed : ");
    if(Computer_Turn == 0) {
        System.out.println("Rock");
    } else if(Computer_Turn == 1){
        System.out.println("Paper");
    } else if(Computer_Turn == 2){
        System.out.println("Scissor");
    }

System.out.println("Here is the winner : ");
if(Your_Turn == 0 && Computer_Turn == 1) {
        System.out.println("Oops! The computer won. Better luck next time");
} else if(Your_Turn == 1 && Computer_Turn == 2) {
    System.out.println("Oops! The computer won. Better luck next time");
} else if(Your_Turn == 2 && Computer_Turn == 0) {
        System.out.println("Oops! The computer won. Better luck next time");
} else if(Your_Turn == 1 && Computer_Turn == 0) {
        System.out.println("Congragulations! You won!");
} else if(Your_Turn == 2 && Computer_Turn == 1) {
    System.out.println("Congragulations! You won!");
} else if(Your_Turn == 0 && Computer_Turn == 2) {
    System.out.println("Congragulations! You won!");
} else if(Your_Turn == 0 && Computer_Turn == 0 || Your_Turn == 1 && Computer_Turn == 1 || Your_Turn == 2 && Computer_Turn == 2) {
    System.out.println("Sorry, the match is drawn. Please play again.");
}

}
}