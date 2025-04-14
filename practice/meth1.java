import java.util.*;
public class meth1 {
    void displayTable()
    {
        int no,i,ans;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        no=sc.nextInt();

        for(i=1;i<=10;i++)
        {
            ans=no*i;
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        meth1 obj= new meth1();
        obj.displayTable();
    }
}
