class div
{
    public static void main (String args [])
    {
        int no;
        no = Integer.parseInt (args[0]);
        if (no % 5 == 0 && no % 7 == 0 && no % 9 == 0 )
        {
            System.out.println(no+" : is divisisble by 5,7 & 9");
        } 
        else
        {
            System.out.println(no+" : id not divisible by 5,7 & 9");
        }
    }
}