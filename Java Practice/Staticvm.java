//Static variable and method
public class Staticvm {
    int x; //non static variable
    static int y; //static variable

    void show()
    {
        System.out.println("value of x:"+x); //garbage value (is set 0 in system)
        System.out.println("value of y:"+y); // will take static value i.e:0
    }
    static void display()
    {
        System.out.println("value of y:"+y);
    }
    public static void main(String[] args) {
        Staticvm pp=new Staticvm();
        pp.show();
        display();
    }
}
