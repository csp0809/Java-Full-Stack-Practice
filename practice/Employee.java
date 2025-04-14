//Default Constructor Example
import java.util.*;
    class Employee
    {
        int id;
        String nm;
        double salary;
        Employee () //default Constructor
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter ID :");
            id=sc.nextInt();
            System.out.println("Enter Name :");
            nm=sc.next();
            System.out.println("Enter Salary :");
            salary=sc.nextDouble();
        }
        void display()
        {
            double da,hra,gross,incentive;
            da=salary*5/100;
            hra=salary*10/100;
            incentive=2000;
            gross=salary+da+hra+incentive;
            System.out.println("ID"+id+"\t Name :"+nm+"\t Salary :"+salary+
            "\t DA :"+da+"\t HRA :"+hra+"\t Incentive :"+incentive+"\t Gross :"+gross);
        }
        public static void main(String[] args) {
            Employee e=new Employee();
            e.display();
        }
    }
    

