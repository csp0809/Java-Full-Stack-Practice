class leap
{
    public static void main(String args [])
    {
        int l;
        l = Integer.parseInt(args[0]);
        if (l % 4 == 0)
        {
         System.out.println(l+" : is a leap year");
        }
         else
        {
         System.out.println(l+" : is not a leap year");
        }
    }
}