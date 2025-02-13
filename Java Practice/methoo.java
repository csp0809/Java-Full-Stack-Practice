// //method overloading

// public class methoo {
//     void area()
//     {
//         int r;
//         r=10;
//         System.out.println("area of Circle: "+(3.14*r*r));
//     }
//     void area(int x, int y)
//     {
//         System.out.println("Area of rectangle: "+(x*y));
//     }
//     void area(double a,double b)
//     {
//         System.out.println("area of triangle: "+(0.5*a*b));
//     }
//     public static void main(String[] args) {
//         methoo m=new methoo();
//         m.area();
//         m.area(5, 6);
//         m.area(3, 4);
//     }
// }

// public class methoo {

//     void area()
//     {
//         int a=10,b=20;
//         System.out.println("Area of rectangle "+(a*b));
//     }
//     void area(int r){
//         System.out.println("area of circle "+(3.14*r*r));
//     }
//     void area(int a, int b)
//     {
//         System.out.println("area of Triangle "+(0.5*a*b));
//     }
//     public static void main(String[] args) {
//         methoo m=new methoo();
//         m.area();
//         m.area(4);
//         m.area(4, 5);
//     }
// }

//method overloading

public class methoo {

    void area(){
        int a= 4, b=6;
        System.out.println("Area of Rectangle:"+(a*b));
        
    }
    void area(double x){
        
        System.out.println("Area of Circle :"+(3.14*x*x));
    }
    void area(float l, float h){
        System.out.println("Area of triangle :"+(0.5*l*h));
    }

    public static void main(String[] args) {
        methoo m=new methoo();
        m.area();
        m.area(15);
        m.area(3, 8);
    }
}