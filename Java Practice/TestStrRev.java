import java.util.Scanner;

public class TestStrRev {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.next();
        int length=s.length();
        for(int i=length-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
