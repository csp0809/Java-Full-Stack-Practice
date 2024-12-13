import java.util.*;


public class TestAna {
    public static void main(String[] args) {
        String s1,s2;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Strings");
        s1=sc.next();
        s2=sc.next();

        String copys1=s1.replaceAll("s","");
        String copys2=s2.replaceAll("s","");

        boolean status=true;

        if(copys1.length() !=copys2.length()){
            status=false;
        }
        else{
            char [] s1Array=copys1.toLowerCase().toCharArray();
            char [] s2Array=copys2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            
            status= Arrays.equals(s1Array, s2Array);
            if(status==true){
                System.out.println("Strings are Anagrams");
            }
            else{
                System.out.println("Strings are not Anagrams");
            }
        }

    }
}
