//example of multi level inheritance
import java.util.*;

class Student {
    int roll;
    String nm;
    double usub1;
    double usub2;
    double usub3;

    double fsub1;
    double fsub2;
    double fsub3;
    Scanner c=new Scanner(System.in);

    void Test(){
        System.out.println("enter roll no : ");
        roll=c.nextInt();
        // c.nextLine(); //used to consume extra space left by scanner 
        // but can also be resolved by using next() instead of nextLine() to scan string
        System.out.println("enter name :");
        nm=c.next();
        System.out.println("enter 3 sub marks for unit test :");
        usub1=c.nextDouble();
        usub2=c.nextDouble();
        usub3=c.nextDouble();

        System.out.println("enter 3 sub marks for Final test :");
        fsub1=c.nextDouble();
        fsub2=c.nextDouble();
        fsub3=c.nextDouble();

    }
}
class unitTest extends Student
{
    double avg;

    void marks()
    {
    avg=(usub1+usub2+usub3)/3;
    }
    
}
class finalTest extends unitTest
{
    double avg2;
    
    void marks1()
    {
        avg2=(fsub1+fsub2+fsub3)/3;
    }

    void display()
    {
        System.out.println("roll no:"+roll);
        System.out.println("Student  Name : "+nm);
        System.out.println("Student Unit Test marks for \t Sub1: "+usub1+"\t Sub2: "+usub2+"\t Sub3: "+usub3);
        System.out.println("Student Unit test Avg : "+avg);
        System.out.println("Student Final Test marks for \t Sub1: "+fsub1+"\t Sub2: "+fsub2+"\t Sub3: "+fsub3);
        System.out.println("Student Final Test Avg : "+avg2);
    }
}
public class multi {
    public static void main(String[] args) {
        finalTest o=new finalTest();
        o.Test();
        o.marks();
        o.marks1();
        o.display();
    }
}
