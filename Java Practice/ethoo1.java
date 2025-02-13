//constructor in derived class

public class methoo1 {
    int no1;
    methoo1()
    {
        no1=5;
    }
}
class B extends methoo1
{
    int no2;
    B()
    {
        no2=10;
    }
    void max()
    {
        if(no1>no2)
        {
            System.out.println(no1+" Is max");
        }
        else
        {
            System.out.println(no2+" Is max");
        }
    }
    public static void main(String[] args) {
        B obj=new B();
        obj.max();
    }
}
