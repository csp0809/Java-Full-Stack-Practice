import java.util.*;
public class Bank {
    int accno,with,depo;
    double bal;
    String nm;
    
    void Account()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account No :");
        accno=sc.nextInt();
        System.out.println("Enter Account Balance :");
        bal=sc.nextDouble();
        System.out.println("Enter Account Holder's Name :");
        nm=sc.nextLine();
        System.out.println("Enter Ammount you want to withdraw : ");
        with=sc.nextInt();
        System.out.println("Enter Ammount you want to Deposit : ");
        depo=sc.nextInt();
    }
    void debit()
    {
       bal=bal-with;
       System.out.println("Balance after withdrawal :"+bal);
    }
    void credit()
    {
       bal=bal+depo;
       System.out.println("Balance after Deposit :"+bal);
    }
    public static void main(String[] args) {
        Bank p=new Bank();
        p.Account();
        p.debit();
        p.credit();
    }
}
