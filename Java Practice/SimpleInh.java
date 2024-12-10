/*class First
{
    public static void main(String args[])
    {
        System.out.println("Welcome to java");
    }
}
*/

import java.util.*;

class Emp {
    int id;
    String nm;
    double sal;
    Scanner sc=new Scanner(System.in);
    

    void getempdetails()
    {
    System.out.println("Enter Employee ID");
    id=sc.nextInt();
    sc.nextLine(); // Consume the leftover newline
    System.out.println("Enter Employee Name");
    nm=sc.nextLine();
    System.out.println("Enter Employee Salary");
    sal=sc.nextDouble();
    }
}
class Account extends Emp
{
    double da,hra,gross;
    void salaryCal()
    {
        da=sal*5/100;
        hra=sal*10/100;
        gross=sal+da+hra;
    }
    void display()
    {
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+nm);
        System.out.println("Employee Salary : "+sal);
        System.out.println("Employee DA : "+da);
        System.out.println("Employee HRA : "+hra);
        System.out.println("Employee GROSS : "+gross);
    }
}
public class SimpleInh {
    public static void main(String[] args) {
        Account obj=new Account();
        obj.getempdetails();
        obj.salaryCal();
        obj.display();
    }
    
}