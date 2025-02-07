import java.util.Scanner;

public class vow {
    public static void main(String[] args) {
        String og;
        int count=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        og=sc.next();

        int l=og.length();

        for(int i=l-1;i>=0;i--)
        {
            char r=og.charAt(i);

            if(r=='a' ||r=='i' ||r=='e' ||r=='o' ||r=='u' ||r=='A' ||r=='E' ||r=='I' ||r=='O' ||r=='U')
            {
                count++;

            }
        }
        System.out.println(count);
    }
}
