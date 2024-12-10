class triangle
{
    public static void main (String args[])
    {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        if (a==b && b==c)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (a==b || b==c || a==c)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}