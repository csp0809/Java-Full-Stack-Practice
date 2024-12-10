//multiple catch
public class Except5 {
    public static void main(String[] args) {
        int a[]=new int[3];
        int x,y;
        try{
            x=9;
            y=x/0;
        }
        catch(ArithmeticException ee)
        {
            System.out.println(ee);
        }
        try{
            a[5]=45;
            System.out.println(a[5]);
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
    }
}
