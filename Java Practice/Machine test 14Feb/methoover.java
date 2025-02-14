public class methoover {

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