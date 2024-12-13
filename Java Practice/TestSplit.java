import java.util.Scanner;

public class TestSplit {
    public static void main(String[] args) {
        String s;
        StringBuilder alpha=new StringBuilder();
        StringBuilder num=new StringBuilder();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.next();

        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)))
            alpha.append(s.charAt(i));
            else{
                num.append(s.charAt(i));
            }
        }
        System.out.println("Alphabtes: "+alpha);
        System.out.println("Numbers: "+num);
    }
}
