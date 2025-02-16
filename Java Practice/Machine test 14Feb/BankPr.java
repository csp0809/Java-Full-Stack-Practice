import java.util.Scanner;

public class BankPr {
    int id;
    String nm;
    double bal;

    public void getDetails(int cid, String cnm, double cbal){
        id=cid;
        nm=cnm;
        bal=cbal;
    }
    public void display()
    {
        System.out.println("Id is : "+id);
        System.out.println("Name is : "+nm);
        System.out.println("Balance is: "+bal);
    }
}

class Deposite extends BankPr{
    void deposite(double d){
        bal +=d ;
    }
}

class Withdraw extends BankPr{
    void withdraw(double w){
        if(bal >2000){
            bal -=w;
        }
        else{
            System.out.println("Insufficient balance!!!");
        }
    }
}

class Pract{
    public static void main(String args[])
    {
        Deposite d= new Deposite();
        Withdraw w= new Withdraw();

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choise : \n 1.Deposite \n 2.Withdraw");
        int n=sc.nextInt();

        switch (n) {
            case 1:
            System.out.println("Enter Account Number: ");    
            int id= sc.nextInt();

            System.out.println("Enter Account Name: "); 
            String nm=sc.next();
            
            System.out.println("Enter Account Balance: ");    
            double bal= sc.nextDouble();

            System.out.println("Enter Ammount to deposite: ");    
            double m= sc.nextDouble();

            d.getDetails(id, nm, bal);
            d.deposite(m);
            d.display();


                break;
            
            case 2:
            System.out.println("Enter Account Number: ");    
            id= sc.nextInt();

            System.out.println("Enter Account Name: "); 
            nm=sc.next();
            
            System.out.println("Enter Account Balance: ");    
            bal= sc.nextDouble();

            System.out.println("Enter Ammount to Withdraw: ");    
            m= sc.nextDouble();

            w.getDetails(id, nm, bal);
            w.withdraw(m);
            w.display();
                break;
        
            default:
            System.out.println("Enter A valid choice!!!");
                break;
        }
        
    }
}