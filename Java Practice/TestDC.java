import java.util.Scanner;

public class TestDC {
    int no;
    TestDC(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number");
        no=sc.nextInt();
        
    }
    void square()
    {
        int sqr=no*no;
        System.out.println("Square is : "+sqr);
    }
    public static void main(String[] args) {
        TestDC d=new TestDC();
        d.square();
    }

}
