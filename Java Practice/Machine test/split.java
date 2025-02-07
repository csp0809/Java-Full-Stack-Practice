    import java.util.*;

public class split {

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.next();

        StringBuilder alpha=new StringBuilder();
        StringBuilder num=new StringBuilder();
        StringBuilder special=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                alpha.append(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))){
                num.append(s.charAt(i));
            }
            else{
                special.append(s.charAt(i));
            }
        }
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }
}
