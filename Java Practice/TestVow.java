import java.util.Scanner;

public class TestVow {
    public static void main(String[] args) {
        String s;
        int count=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Ennter a Stringg");
        s=sc.next();

        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
                count++;
            }

        }
        System.out.println(count);
    }
}
