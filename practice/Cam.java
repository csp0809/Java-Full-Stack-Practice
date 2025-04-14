import java.util.*;
public class Cam {
    public static void main(String[] args) {
        String s;
        int count=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a camelCase String");
        s=sc.next();
        char [] copys=s.toCharArray();

        int length= s.length();

        for(int i=0; i<length;i++){
            if(Character.isLowerCase(s.charAt(i))==true){
                System.out.print(s.charAt(i));

            }
            else{
                
                System.out.println(s.charAt(i));
                count++;
            }
            
        }
        System.out.println();
        System.out.println(count);
    }
}
