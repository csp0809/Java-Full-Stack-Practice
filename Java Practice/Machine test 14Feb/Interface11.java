interface i1{
    void add();
}
interface i2{
    int area(int x, int y);
}
public class Interface11 implements i1,i2 {
    public   void add(){
        int a=5, y=20;
        System.out.println(a+y);
    }
    public int area(int x, int y){
        int z=x*y;
        return z;
    }
    public static void main(String args[]){
        Interface11 i = new Interface11();
        i.add();
        int a=i.area(30,3);
        System.out.println(a);
    }
}
