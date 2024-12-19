
abstract class shape {
    shape()
    {
        System.out.println("constructor called");
    }
    void show()
    {
        System.out.println("method called");
    }
    abstract void area();
}
class Circle extends shape
{
    void area()
    {
        int r=5;
        System.out.println("area of circle : "+(Math.PI*r*r));
    }
}
class Rectangle extends shape
{
    void area()
    {
        int l=6,b=9;
        System.err.println("area of rectangle : "+(l*b));
    }
}
public class AbstractPract
{
    public static void main(String[] args) {
        shape s;
        s=new Circle(); //constructor called
        s.show();
        s.area();
        s=new Rectangle(); //constructor called
        s.show();
        s.area();
    }
}
