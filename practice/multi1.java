import java.util.Scanner;

class Student {
    int sid;
    String snm;
    void getDetails(int sid,String snm)
    {
        this.sid=sid;
        this.snm=snm;
    }
}
class Marks extends Student 
{
    int s1,s2,s3;
    void getMarks(int m1,int m2,int m3)
    {
        s1=m1;
        s2=m2;
        s3=m3;
    }
}
class Result extends Marks
{
    int t;
    void Cal()
    {
        t=s1+s2+s3;
    }
    void display()
    {
        System.out.println("ID"+sid);
        System.out.println("Name"+snm);
        System.out.println("Marks 1\t"+s1);
        System.out.println("Marks 2\t"+s2);
        System.out.println("Marks 3\t"+s3);
    }
}
class Pract
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Result r=new Result();
        int id,marks1,marks2,marks3;
        String name;
        System.out.println("ENter ID");
        id =sc.nextInt();
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter 3 subject marks");
        marks1=sc.nextInt();
        marks2=sc.nextInt();
        marks3=sc.nextInt();
        r.getDetails(id, name);
        r.getMarks(marks1,marks2,marks3);
        r.Cal();
        r.display();

    }
}
