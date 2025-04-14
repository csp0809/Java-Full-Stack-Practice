class posneg
{
    public static void main(String args[])
    {
        int no;
        no = Integer.parseInt(args[0]);
        if(no > 0)
        {
            System.out.println(no+": is positive");
        }
        else
        {
            System.out.println(no+": is negative");
        }
    }
}