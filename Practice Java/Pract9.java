import java.util.*;
public class Pract9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int id;
        String nm;
        double sal;
        char gender;
        System.out.println("Enter ID : ");
        id= sc.nextInt();

        System.out.println("Enter Name : ");
        nm= sc.next();

        System.out.println("Enter Salary : ");
        sal= sc.nextDouble();

        System.out.println("Enter Gender : ");
        gender = sc.next().charAt(0);

        System.out.println("==================================================");
        System.out.println(id);
        System.out.println(nm);
        System.err.println(sal);
        System.out.println(gender);
    }
}
