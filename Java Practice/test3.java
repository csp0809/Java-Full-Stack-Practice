import java.util.Scanner;

public class test3 {
    int acno,balance;
    String acnm;

    void getdata(int no, String nm, int bal)
    {
        acno=no;
        acnm=nm;
        balance=bal;
    }
    void display()
    {
        System.out.println("Account No : " +acno);
        System.out.println("Account holders name : "+acnm);
        System.out.println("balance : "+balance);
    }
}
class Deposit extends test3
{
    void deposite(int dep)
    {
        balance +=dep;
    }
}
class Withdraw extends test3
{
    void withdraw(int wit)
    {
        if(balance>1000)
        {
            balance -=wit;
        }
        else
        {
            System.out.println("Insufficient Balance !!!/n");
        }
    }
}
class Pract
{
    public static void main(String[] args) {
        Deposit d=new Deposit();
        Withdraw w=new Withdraw();

        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for deposite /n Press 2 for Withdrawal");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("enter account number");
            int no=sc.nextInt();
            System.out.println("enter account holders name ");
            String nm =sc.next();
            System.out.println("enter balance");
            int bal=sc.nextInt();
            System.out.println("enter amount to deposit");
            int dep=sc.nextInt();

            d.getdata(no, nm, bal);
            d.deposite(dep);
            d.display();

                break;
            
            case 2:
            System.out.println("enter account number");
            no=sc.nextInt();
            System.out.println("enter account holders name ");
            nm =sc.next();
            System.out.println("enter balance");
            bal=sc.nextInt();
            System.out.println("enter amount to withdraw");
            int wit=sc.nextInt();

            w.getdata(no, nm, bal);
            w.withdraw(wit);
            w.display();
            break;
        
            default:
            System.out.println("Enter a valid choice!!!");
                break;
        }
    }
}
