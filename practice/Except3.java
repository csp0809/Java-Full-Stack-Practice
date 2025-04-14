
public class Except3 {
    public static void main(String[] args) {
        int a[]=new int[3];
        try{
            a[5]=45;
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("code excute");
        }
    }
}