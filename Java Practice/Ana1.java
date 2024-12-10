import java.util.*;

public class Ana1 {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 Strings");
        s1=sc.next();
        s2=sc.next();
        
        String copys1=s1.replaceAll("s", "");
        String copys2=s2.replaceAll("s", "");

        boolean status=true;

        if(copys1.length() != copys2.length()){
            status=false;
        }
        else
        {
            char [] s1array=copys1.toLowerCase().toCharArray();
            char [] s2array=copys2.toLowerCase().toCharArray();

            Arrays.sort(s1array);
            Arrays.sort(s2array);

            status=Arrays.equals(s1array,s2array);

            if(status==true){
                System.out.println("These Strings Are Anagrams.");
            }
            else{
                System.out.println("These Strings Are Not Anagrams.");
            }
        }
    }
}
