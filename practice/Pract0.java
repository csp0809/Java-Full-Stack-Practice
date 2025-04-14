import java.util.*;

class Emp {
    int id;
    String nm;
    double sal;

    void getempdetails(int eid,String enm, double esal)
    {
        id=eid;
        nm=enm;
        sal=esal;
    }
}
class account extends Emp
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
public class Pract0 {
    public static void main(String[] args) {
        account obj=new account();
        obj.getempdetails(101,"XYX",8500);
        obj.salaryCal();
        obj.display();
    }
    
}
