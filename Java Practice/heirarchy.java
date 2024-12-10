class A {
    int x,y;
    void getno(int a,int b)
    {
        x=a;
        y=b;
    }
}
class B extends A
{
    void add()
    {
        System.out.println("addition :"+(x+y));
    }
}
class C extends A{
    void subs()
    {
        System.out.println("SUbstraction :"+(x-y));
    }
}
class Pract
{
    public static void main(String[] args) {
        B ob=new B();
        ob.getno(4, 2);
        ob.add();

        C ob1=new C();
        ob1.getno(9, 3);
        ob1.subs();
    }
}