class bigger
{
    public static void main (String args[])
    {
        int a,b;
        a = Integer.parseInt (args[0]);
        b = Integer.parseInt (args[1]);
        if (a > b)
        {
            System.out.println( a+ " : is a bigger number");
        }
        else
        {
            System.out.println( b+ " : is a bigger number");
        }
    }
}