class pract
{
    public static void main (String args[])
    {
        int no;
        no = Integer.parseInt(args[0]);
        switch (no)
        {
            case 1:
                System.out.println("you're in case 1");
            break;
            case 2:
                System.out.println("you're in case 2");
            break;
            case 3:
                System.out.println("you're in case 3");
            break;
            default:
                System.out.println("Please Enter a valid choice");

        }
    }
}