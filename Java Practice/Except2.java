
public class Except2 {
    public static void main(String[] args) {
        String nm;
        try{
            nm=null;
            System.out.println(nm.length());
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
