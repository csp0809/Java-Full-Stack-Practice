import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
class userinput{
   public String name;
   public String bankname;
   public int balance;
   public int acnum;


    public userinput(String name, String bankname, int balance, int acnum){
        this.name = name;
        this.bankname  = bankname;
        this.balance = balance;
        this.acnum = acnum;
    }


    public String displayname() {
        return name;
    }
    public String displaybanknname() {
        return name;
    }
    public int displayacnum() {
        return acnum;
    }
    public int displaybalance() {
        return balance;
    }

}
public class SaveData {
      public   String currentname;
   public int currentac;
   public int currentbalance;
    ArrayList users = new ArrayList();


    public void displayalldata(){
        Iterator itr = users.iterator();

        while(itr.hasNext()){
           userinput u = (userinput)itr.next();
            System.out.println("All data :");

            System.out.println(u.displayacnum());
            System.out.println(u.displaybalance());

        }
    }

    public void depositfunc(String name, int amout){
        Iterator itr = users.iterator();

        while(itr.hasNext()){
            userinput u = (userinput)itr.next();


            if(name.equalsIgnoreCase(u.name)){

                u.balance += amout;

                System.out.println(u.balance);


                currentname =  u.name;
                currentac = u.acnum;
                currentbalance = u.balance;

            }

        }

    }


    public void widraw(String name, int amout){
        Iterator itr = users.iterator();

        while(itr.hasNext()){
            userinput u = (userinput)itr.next();

            if(amout < u.balance){


            if(name.equalsIgnoreCase(u.name)){

                u.balance -= amout;
                System.out.println(u.balance);

                currentname =  u.name;
                currentac = u.acnum;
                currentbalance = u.balance;
            }
            }

            else {
                System.out.println("Your balance is low");
            }

        }
    }


    public String displaycurentname(){
        return currentname;
    }
    public String displaycurrentaccount(){
        return String.valueOf(currentac);
    }
    public String displaycurrentbalance(){
        return String.valueOf(currentbalance);
    }



    public void appendingcustomer(ArrayList user){
        try {
            // Open the file with try-with-resources to ensure it gets closed
            FileWriter file = new FileWriter("customerdata.txt");
            try (BufferedWriter writer = new BufferedWriter(file)) {
                // Iterate over the customer array and write to the file

                Iterator itr = user.iterator();
                while (itr.hasNext()){
                	userinput eachCustomer = (userinput) itr.next();

                	String eachlinne = "Name : " + eachCustomer.name  +  " , " + "Bank name : " + eachCustomer.bankname + " , " + "Account : " + eachCustomer.acnum + "Balance :" + eachCustomer.balance;
                	writer.write(eachlinne); // Assuming toString() provides a meaningful representation
                	writer.newLine(); // Add a new line after each customer



    // writer.write(eachCustomer.displayName()); // Assuming toString() provides a meaningful representation
                	writer.newLine();
                	writer.write("");
}

            }
        	} 		
        	catch (Exception e) {
            // Handle the exception
        		e.printStackTrace();


        }

    }
}
