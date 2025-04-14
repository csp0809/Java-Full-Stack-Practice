class pract
{
    public static void main (String args[])
    {
        int a,b,c,choice;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        choice = Integer.parseInt(args[2]);
        switch (choice)
        {
            case 1:
                c = a+b;
                System.out.println(c);
                
            break;
            case 2:
                c = a-b;
                System.out.println(c);
            break;
            case 3:
                c = a*b;
                System.out.println(c);
                break;
            case 4:
                c = a/b;
                System.out.println(c);
            break;
            default:
                System.out.println("Please Enter a valid choice");

        }
    }
}