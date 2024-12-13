import java.util.Scanner;
public class TestPC {
    int no;
    TestPC(int no1){
        no=no1;
    }
    void square()
    {
        int sqr,no2;
        no2=no;
        sqr=no2*no2;
        System.out.println("Square is : "+sqr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number");
        int x=sc.nextInt();
        TestPC d=new TestPC(x);
        d.square();
    }
}
