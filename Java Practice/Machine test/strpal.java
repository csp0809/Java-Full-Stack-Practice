import java.util.Scanner;

public class strpal {
    public static void main(String[] args) {
        String og,rev="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        og=sc.next();

        int l=og.length();

        for(int i=l-1;i>=0;i--)
        {
            rev=rev+og.charAt(i);
        }
        if(og.equals(rev))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}

