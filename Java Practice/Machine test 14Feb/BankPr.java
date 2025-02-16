

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
        System.out.println("Id is : ");
        System.out.println("Name is : ");
        System.out.println("Balance is: ");
    }
}

class Deposite extends BankPr{
    Deposite(double d){
        bal +=d ;
    }
}

class Withdraw extends BankPr{
    WIthdraw(double w){
        bal -=w;
    }
}

class Pract{
    public static void main(String args[])
    {
        Deposite d= new Deposite();
        Withdraw w= new Withdraw();

        Scanner sc=new Scanner(System.in)
    }
}