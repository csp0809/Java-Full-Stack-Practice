// interface i1{
//     void add();
// }
// interface i2{
//     int area(int x, int y);
// }
// public class Interface11 implements i1,i2 {
//     public   void add(){
//         int a=5, y=20;
//         System.out.println(a+y);
//     }
//     public int area(int x, int y){
//         int z=x*y;
//         return z;
//     }
//     public static void main(String args[]){
//         Interface11 i = new Interface11();
//         i.add();
//         int a=i.area(30,3);
//         System.out.println(a);
//     }
// }

interface i1{
   void add();
}

interface i2{
    double area(double x, double y);
 }

class Pract implements i1,i2{
    public void add(){
        int a=10, b=20;
        System.out.println("addition is :"+(a+b));
    }
    public double area(double x, double y){
        double a=x*y;
        return a;
    }
    public static void main(String[] args) {
        Pract p=new Pract();
        p.add();
        double d=p.area(20, 10);
        System.out.println("Area is: "+d);
    }
}