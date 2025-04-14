class Pract
{
    public static void main (String args[])
    {
        int age;
        age = Integer.parseInt(args[0]);
        if (age > 60)
        {
            System.out.println("You're a Senior Citizen");
        }
        else if (age > 18)
        {
            System.out.println("You're a Adult");
        }
        else if (age > 12)
        {
            System.out.println("You're a Teenager");
        }
        else if (age > 6)
        {
            System.out.println("You're a Preschooler");
        }
        else if (age > 2)
        {
            System.out.println("You're a Toddler");
        }
        else if (age > 0)
        {
            System.out.println("You're a Infant");
        }
    }

}