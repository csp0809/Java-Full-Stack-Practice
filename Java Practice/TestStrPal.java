import java.util.Scanner;
public class TestStrPal {

    public static void main(String[] args) {
        String s,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.next();
        int length=s.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        if(rev.equals(s)){
            System.out.println("String Is Palindrome");
        }
        else{
            System.out.println("String Is not Palindrome");
        }

    }

}
