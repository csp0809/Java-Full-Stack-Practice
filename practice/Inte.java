interface I1 {
    void add();
}
interface I2{
    int area(int x, int y);
}
class Pract implements I1,I2
{
    public void add()
    {
        int x=2,y=10;
        System.out.println("Addition:"+(x+y));
    }
    public int area(int x, int y)
    {
        // System.out.println("Area of rectangle : "+(x*y));
        int z=x*y;
        return z;
    }
    public static void main(String[] args) {
        Pract pp=new Pract();
        pp.add();
        int a=pp.area(6, 07);
        System.out.println(a);
    }
}

