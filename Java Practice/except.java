public class except {
    public static void main(String[] args) {
        int a,b;
        try{
            a=10;
            b=a/0;
            System.out.println(b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
