
public class Except1 {
    public static void main(String[] args) {
        int a,b;
        try{
            a=10;
            b=a/0;
            System.out.println(b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
    }
}
