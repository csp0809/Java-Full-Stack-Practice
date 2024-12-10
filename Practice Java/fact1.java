public class fact1 {
    public static void main(String[] args) {
        int a,b=1,i;
        a = Integer.parseInt (args[0]);
        for (i=1;i<=a;i++)
        {
            b = b*i;
        }
        System.out.println("Factorial is : " +b);
    }
}
