
//nested try block
public class Except6 {
    public static void main(String[] args) {
        int a[]=new int[3];
        int x,y;
        try{
            x=9;
            y=x/2;
            try{
                a[5]=45;
                System.out.println(a[5]);
            }
            
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(ArithmeticException ee)
        {
            System.out.println(ee);
        }
        
        
    }
}

