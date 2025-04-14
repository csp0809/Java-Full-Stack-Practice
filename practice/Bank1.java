import java.util.Scanner;

public class Bank1 {

    int accno;
    String name; double balance;

    void getDetails(int bid, String bnm, double bal)
    {
        accno=bid;
        name=bnm;
        balance=bal;
    }
    void display()
    {
        System.out.println("Account No is:"+accno);
        System.out.println("Account Holder's Name is:"+name);
        System.out.println("Account's Balance is:"+balance);
    }
}
class Deposite extends Bank1
{
    void deposite(int dep)
    {
        balance +=dep;
    }
}
class Withdraw extends Bank1
{
    void withdraw(int wit)
    {
        if(balance>1000)
        {
            balance -=wit;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}
class Pract
{
    public static void main(String[] args) {
        Deposite d=new Deposite();
        Withdraw w=new Withdraw();

        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Press 1: Deposite \nPress 2: Withdraw");
        System.out.println("Enter your choice :");
        choice =sc.nextInt();

        switch (choice) {
            case 1:
                d.getDetails(2323, "Chaitanya", 200000);
                d.deposite(10000);
                d.display();
                break;
            
            case 2:
                w.getDetails(2424, "Don", 999999);
                w.withdraw(50000);
                w.display();
                break;
            default:
                System.out.println("Please Enter A Valid Choice!");;
        }

    }
}