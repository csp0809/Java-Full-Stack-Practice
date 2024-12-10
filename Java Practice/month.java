class month
{
    public static void main (String args[])
    {
        String mnt;
        mnt = args[0];
        switch(mnt)
        {
            case "jan":
            case "march":
            case "may":
            case "july":
            case "aug":
            case "oct":
            case "dec":
            System.out.println("31 days");
            break;

            case "feb":
            System.out.println("28 days");
            break;

            case "april":
            case "june":
            case "sept":
            case "nov":
            System.out.println("30 days");
            break;

            default:
            System.out.println("Please enter valid choice");
        }
    }
}