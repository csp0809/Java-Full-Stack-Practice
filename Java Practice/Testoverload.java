public class Testoverload {
    void area(){
        int a=6,b=6;
        System.out.println("Area of Square : "+(a*b));
    }
    void area(int r){
        System.out.println("Area of Circle : "+(3.14*r*r));
    }
    void area(int h, int b){
        System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public static void main(String[] args) {
        Testoverload t=new Testoverload();
        t.area();
        t.area(7);
        t.area(9, 10);
    }
}
