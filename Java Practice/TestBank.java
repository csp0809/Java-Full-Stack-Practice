import java.util.*;
public class TestBank {
    int accno;
    String acnm;
    double balance;

    void getDetails(int no, String nm, double bal){
        accno=no;
        acnm=nm;
        balance=bal;
    }
    void display(){
        System.out.println("Account no is : "+accno);
        System.out.println("Account Holder's name is : "+acnm);
        System.out.println("Account Balance : "+balance);
    }
}
class Deposite extends TestBank{
    void deposite(int dep){
        balance +=dep;
    }
}

class Withdraw extends TestBank{
    void withdraw(int wit){
        if(balance>1000){
            balance-=wit;
        }
        else{
            System.out.println();
            System.out.println();
            System.out.println("Insufficient Balance !!!!!");
        }
    }
}
class Atm
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
                System.out.println("Enter Account No :");
                int id=sc.nextInt();
                
                System.out.println("Enter Account Holder's Name :");
                String nm=sc.next();

                System.out.println("Enter Balance Amount :");
                double bal=sc.nextDouble(); 

                System.out.println("Enter Deposite Amount :");
                int dep=sc.nextInt();
                
                d.getDetails(id, nm, bal);
                d.deposite(dep);
                d.display();
                break;
            
            case 2:

            System.out.println("Enter Account No :");
            id=sc.nextInt();
            
            System.out.println("Enter Account Holder's Name :");
            nm=sc.next();

            System.out.println("Enter Balance Amount :");
            bal=sc.nextDouble(); 

            System.out.println("Enter Withdrawal Amount :");
            int wit=sc.nextInt();

                w.getDetails(id, nm, bal);
                w.withdraw(wit);
                w.display();
                break;
            default:
                System.out.println("Please Enter A Valid Choice!");;
        }

    }
}

