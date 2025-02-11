// //abstract practical  

// abstract class shape{
//     shape(){
//         System.out.println("constructor");
//     }
//     void show(){
//         System.out.println("method called");
//     }
//     abstract void area();
    
// }

// class Circle extends shape{
//     void area(){
//         int r=5;
//         System.out.println(3.14*r*r);
//     }
// }

// class Rectangle extends shape{
//     void area(){
//         int l=6,b=4;
//         System.out.println("Area of rect:"+ (l*b));
//     }
// }

// public class Abstractp {
//     public static void main(String[] args) {
//         shape s;
//         s= new Circle();
//         s.show();
//         s.area();
//         s= new Rectangle();
//         s.show();
//         s.area();
//     }
// }


//abstract practical

abstract class shape{
    shape(){
        System.out.println("constructor called");
    }
    public void show(){
        System.out.println("method called");
    }
    abstract void area();
}

class Circle extends shape{
    void area(){
        int r=8;
        System.out.println("Area of circle is:"+(3.14*r*r));
    }
}

class Rectangle extends shape{
    void area(){
        int l=5,b=10;
        System.out.println("Area of Rectangle:"+(l*b));
    }
}
public class Abstractp {
    public static void main(String[] args) {
        shape s;
        s= new Circle();
        s.show();
        s.area();
        s= new Rectangle();
        s.show();
        s.area();
    }
    
}