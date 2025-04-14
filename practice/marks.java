class bigger
{
    public static void main (String args[])
    {
        int a,b,c,t;
        double avg;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        t = a+b+c;
        System.out.println("Total : "+t);
        avg = t/3;
        System.out.println("AVG : "+avg);
        if (avg >= 75)
        {
            System.out.println("Distinction");
        }
        else if (avg >= 60)
        {
            System.out.println("First Class");   
        }
        else if (avg >= 45)
        {
            System.out.println("Second Class");
        }
        else if (avg >= 35)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}


 
