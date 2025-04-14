//method overloading

public class methoo {
    void area()
    {
        int r;
        r=10;
        System.out.println("area of Circle: "+(3.14*r*r));
    }
    void area(int x, int y)
    {
        System.out.println("Area of rectangle: "+(x*y));
    }
    void area(double a,double b)
    {
        System.out.println("area of triangle: "+(0.5*a*b));
    }
    public static void main(String[] args) {
        methoo m=new methoo();
        m.area();
        m.area(5, 6);
        m.area(3, 4);
    }
}
