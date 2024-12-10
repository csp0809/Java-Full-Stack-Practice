//throw keyword
//custom exception
class AgeException extends Exception{
    AgeException(String s)
    {
        super(s);
    }
}
class AgeTracker
{
    public static void ageCheck(int age)throws AgeException {
        if(age>=18)
        {
            System.out.println("youre eligible to vote");
        }
        else
        {
            throw new AgeException("Youre not eligible to vote");
        }
    }
    public static void main(String[] args) {
        try
        {
            ageCheck(12);
        }
        catch(AgeException e)
        {
            System.out.println(e);
        }
    }
}