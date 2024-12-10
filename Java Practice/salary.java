public class salary
{
    public static void main(String args[])
    {
        double sal,da,hra,gross;
        sal = Double.parseDouble(args[0]);

        da = sal*5/100;
        hra = sal*10/100;
        gross = sal+da+hra;
        System.out.println("DA:"+da);
        System.out.println("HRA:"+hra);
        System.out.println("GROSS:"+gross);
    }
}