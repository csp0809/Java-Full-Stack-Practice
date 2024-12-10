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
        I1 obj1 = new Pract();
        obj1.add();

        I2 obj2 = new Pract();
        int a=obj2.area(6,7);
        System.out.println(a);
    }
}
